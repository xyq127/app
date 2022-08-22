package com.app.config;

import com.app.service.impl.UserServiceImpl;
import com.app.utils.LoginSuccessHandle;
import com.app.utils.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserServiceImpl user;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(user);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .formLogin()
                .loginPage("/vihoadmin/login.html")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(new LoginSuccessHandle());

        http
                .authorizeRequests()
                .antMatchers("/holity/js/**", "/holity/css/**", "/holity/images/**", "/holity/fonts/**").permitAll()
                .antMatchers("/viho/assets/**", "/viho/starter-kit/**").permitAll()
                .antMatchers("/holity/index.html", "/", "/index", "/vihoadmin/sign-up.html", "/vihoadmin/login.html").permitAll()
                .antMatchers("/loginRegisterController/**", "/loginRegisterController/checkSignUpTel").permitAll()
                .antMatchers("/holity/support-us.html").hasAnyRole("ADMIN", "ORGANIZATION")
                .antMatchers("/vihoadmin/**","/admin/**").hasRole("ADMIN")
                .antMatchers("/vihoorg/**","/org/**").hasRole("ORGANIZATION")
                .antMatchers("/holity/**","/activity/**").permitAll()
                .anyRequest().authenticated();

        http.csrf().disable();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new MyPasswordEncoder();
    }
}
