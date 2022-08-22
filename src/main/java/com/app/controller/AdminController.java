package com.app.controller;


import com.app.entity.Activity;
import com.app.entity.Msg;
import com.app.service.ActivityService;
import com.app.service.OrganizationService;
import com.app.service.ParticipateService;
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
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    ActivityService activityService;

    //查询该num的所有未审查的活动
    @RequestMapping(value = "/findAuditActivityByState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findAuditActivityByState() {

        List<Activity> auditActivity = activityService.getActivityByState("0");//查询该num的所有未审查的活动

        return Msg.success().add("auditActivity", auditActivity);
    }

    //审核通过志愿活动
    @RequestMapping(value = "/passAct", method = RequestMethod.POST)
    @ResponseBody
    public String passAct(@RequestParam(value = "actName") String actName, @RequestParam(value = "statue") String statue, Authentication authentication) {
        System.out.println("-----------actName------:" + actName);
        System.out.println("-----------statue------:" + statue);
        Activity activity = activityService.selectAct(actName);

        User user = (User) authentication.getPrincipal();

        Map<Object, Object> map = new HashMap<>();
        map.put("loginId", user.getUsername());
        map.put("activityNum", activity.getActivityNum());
        map.put("isPass", statue);
        map.put("remark", "");
        activityService.passActByAdminIdWithStatue(map);
        return (String) map.get("msg");
    }
}
