package com.app.controller;


import com.app.service.ParticipateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/participate")
public class ParticipateController {

    @Autowired
    ParticipateService participateService;



    //通过志愿者的报名申请
    @RequestMapping(value = "/volPassRecruit", method = RequestMethod.POST)
    @ResponseBody
    public String volPassRecruit(@RequestParam(value = "participateNum") Integer participateNum) {
        System.out.println(participateNum);

        Map<Object, Object> map = new HashMap<>();
        map.put("participateNum",participateNum);
        map.put("isPass", 1);
        Object msg = participateService.volCheckRecruit(map);

        return (String) msg;
    }

    //不通过志愿者的报名申请
    @RequestMapping(value = "/volUnPassRecruit", method = RequestMethod.POST)
    @ResponseBody
    public String volUnPassRecruit(@RequestParam(value = "participateNum") Integer participateNum) {
        System.out.println(participateNum);

        Map<Object, Object> map = new HashMap<>();
        map.put("participateNum",participateNum);
        map.put("isPass", 2);
        Object msg = participateService.volCheckRecruit(map);

        return (String) msg;
    }



}
