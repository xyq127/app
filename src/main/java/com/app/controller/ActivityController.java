package com.app.controller;

import com.app.entity.Activity;
import com.app.entity.Msg;
import com.app.entity.Participate;
import com.app.service.ActivityService;
import com.app.service.OrganizationService;
import com.app.service.ParticipateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @Autowired
    OrganizationService organizationService;

    @Autowired
    ParticipateService participateService;

    //查询该num的所有未审查的活动
    @RequestMapping(value = "/findAuditActivityByNumAndState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findAuditActivityByNumAndState(Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();
        String id = user.getUsername();

        Integer num = organizationService.getOrganizationNum(id);//获取该id的num用于查询
        List<Activity> auditActivity = activityService.getActivityByNumAndState(num, "0");//查询该num的所有未审查的活动

        return Msg.success().add("auditActivity", auditActivity);
    }


    @RequestMapping(value = "/activityInfo", method = RequestMethod.GET)
    @ResponseBody
    public Msg activityInfo(@RequestParam(value = "activityNum") Integer activityNum) {

        List<Activity> activityInfo = activityService.activityInfo(activityNum);//查询该num的所有活动
        System.out.println(activityInfo);
        return Msg.success().add("activityInfo", activityInfo);
    }

    //删除未审查的活动
    @RequestMapping(value = "/auditActivityDelete", method = RequestMethod.POST)
    @ResponseBody
    public Msg auditActivityDelete(@Param(value = "activityNum") Integer activityNum, Authentication authentication) {
        activityService.deleteAct(activityNum);
        return findAuditActivityByNumAndState(authentication);
    }

    //删除审查未通过的活动
    @RequestMapping(value = "/notAuditActivityDelete", method = RequestMethod.POST)
    @ResponseBody
    public Msg notAuditActivityDelete(@Param(value = "activityNum") Integer activityNum, Authentication authentication) {
        activityService.deleteAct(activityNum);
        return findNotAuditActivityByNumAndState(authentication);
    }

    //查询该num的所有未开始的活动
    @RequestMapping(value = "/findNotStartActivityByNumAndState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findNotStartActivityByNumAndState(Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();
        String id = user.getUsername();
        Integer num = organizationService.getOrganizationNum(id);//获取该id的num用于查询

        List<Activity> auditActivity = activityService.getActivityByNumAndState(num, "1");//查询该num的所有未开始的活动

        return Msg.success().add("auditActivity", auditActivity);
    }

    //查询该活动下所有的报名人的列表
    @RequestMapping(value = "/volRecruit", method = RequestMethod.GET)
    @ResponseBody
    public Msg volRecruit(@RequestParam(value = "activityNum") Integer activityNum) {

//        List<Activity> auditActivity = activityService.getActivityByNumAndState(num, "1");//查询该num的所有未开始的活动
        System.out.println("====================================");
        System.out.println(activityNum);

        List<Participate> volunteerList = participateService.getVolunteerList(activityNum);//查询该num的所有活动

        System.out.println(volunteerList);

        return Msg.success().add("volunteerList", volunteerList);
    }



    //查询该num的所有正在进行中的活动
    @RequestMapping(value = "/findCarryActivityByNumAndState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findCarryActivityByNumAndState(Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();
        String id = user.getUsername();
        Integer num = organizationService.getOrganizationNum(id);//获取该id的num用于查询

        List<Activity> carryActivity = activityService.getActivityByNumAndState(num, "2");//查询该num的所有正在进行中的活动

        return Msg.success().add("carryActivity", carryActivity);
    }

    //查询该num的所有正在进行中的活动
    @RequestMapping(value = "/findEndActivityByNumAndState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findEndActivityByNumAndState(Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();
        String id = user.getUsername();
        Integer num = organizationService.getOrganizationNum(id);//获取该id的num用于查询

        List<Activity> endActivity = activityService.getActivityByNumAndState(num, "3");//查询该num的所有正在进行中的活动

        return Msg.success().add("endActivity", endActivity);
    }

    //查询该num的所有未通过审核的活动
    @RequestMapping(value = "/findNotAuditActivityByNumAndState", method = RequestMethod.GET)
    @ResponseBody
    public Msg findNotAuditActivityByNumAndState(Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();
        String id = user.getUsername();
        Integer num = organizationService.getOrganizationNum(id);//获取该id的num用于查询

        List<Activity> notAuditActivity = activityService.getActivityByNumAndState(num, "4");//查询该num的所有未通过审核的活动

        return Msg.success().add("notAuditActivity", notAuditActivity);
    }

}
