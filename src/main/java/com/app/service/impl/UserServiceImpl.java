package com.app.service.impl;

import com.app.entity.EUser;
import com.app.mapper.EUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private EUserMapper eUserMapper;

    @Override
    public UserDetails loadUserByUsername(String input) throws UsernameNotFoundException {


        List<EUser> eUsers = eUserMapper.selectById(input);
        EUser eUser = eUsers.get(0);

        User user = new User(eUser.getId(),eUser.getPassword(),AuthorityUtils.commaSeparatedStringToAuthorityList(eUser.getRole()));

        return user;
    }
}
