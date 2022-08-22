package com.app.controller;

import com.app.entity.Msg;
import com.app.entity.Organization;
import com.app.entity.Volunteer;
import com.app.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/volunteer")
public class VolunteerController {

    @Autowired
    VolunteerService volunteerService;

    @RequestMapping(value = "/ifLogIn", method = RequestMethod.GET)
    @ResponseBody
    public Msg ifLogIn() {
        System.out.println("==============dsafds==================");
        //获取当前登录的用户名，参数为Authentication
//        User user = (User) authentication.getPrincipal();
//        String volunteerId = user.getUsername();
//        System.out.println(user);

//        List<Volunteer> volunteer=volunteerService.getVolNameById(volunteerId);

        return Msg.success().add("volunteer","dsfda");
    }
}
