package com.app.controller;

import com.app.mapper.VolunteerMapper;
import com.app.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/loginRegisterController")
public class LoginRegisterController {


    @Autowired
    VolunteerService volunteerService;

    @Autowired
    VolunteerMapper volunteerMapper;


    @RequestMapping(value = "/checkSignUpTel", method = RequestMethod.GET)
    @ResponseBody
    public boolean checkSignUpTel(@RequestParam(value = "signUpTel") String signUpTel) {
        System.out.println("-------HELLO----------");
        System.out.println(signUpTel);
        int checkResult = volunteerService.checkSignupTel(signUpTel);
        System.out.println("---checkResult---");
        System.out.println(checkResult);
        if (checkResult > 0) {
            return false;
        } else {
            return true;
        }

    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    @ResponseBody
    public String signUp(@RequestParam(value = "signUpName") String signUpName, @RequestParam(value = "signUpTel") String signUpTel, @RequestParam(value = "signUpPassword") String signUpPassword) {
        System.out.println(signUpName + " " + signUpTel + " " + signUpPassword);
        String volunteerId = volunteerService.signUp(signUpName, signUpTel, signUpPassword);
        System.out.println(volunteerId);
        return volunteerId;
    }


}
