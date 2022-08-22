package com.app.controller;

import com.app.entity.Msg;
import com.app.entity.Organization;
import com.app.service.ActivityService;
import com.app.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/org")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @Autowired
    ActivityService activityService;

    //志愿组组织申请活动
    @RequestMapping(value = "/upact", method = RequestMethod.POST)
    @ResponseBody
    public String upAct(@RequestParam(value = "name") String name,
                        @RequestParam(value = "content") String content,
                        @RequestParam(value = "startTime") String startTime,
                        @RequestParam(value = "endTime") String endTime,
                        @RequestParam(value = "location") String location,
                        @RequestParam(value = "affair") String affair,
                        @RequestParam(value = "need") String need,
                        @RequestParam(value = "sign_ddl") String sign_ddl,
                        Authentication authentication) {

        //获取当前登录的用户名，参数为Authentication
        User user = (User) authentication.getPrincipal();

        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        Date st = df.parse(startTime, new ParsePosition(0));
        Date edT = df.parse(endTime, new ParsePosition(0));
        Date sdd = df.parse(sign_ddl, new ParsePosition(0));

        Map<Object, Object> map = new HashMap<>();
        map.put("loginId", user.getUsername());
        map.put("activityName", name);
        map.put("activityDetail", content);
        map.put("activityBegintime", st);
        map.put("activityEndtime", edT);
        map.put("activityLocation", location);
        map.put("activityNeedpeople", Integer.parseInt(need));
        map.put("activityNotice", affair);//注意事项
        map.put("activitySignddl", sdd);
        organizationService.upAct(map);
        return (String) map.get("msg");
    }

    // 返回界面不能有ResponseBody
//    @RequestMapping(value = "/info",method = RequestMethod.GET)
//    public String getInfo(Authentication authentication, Model model){
//        System.out.println("---------info---------");
//        User user = (User) authentication.getPrincipal();
//        Organization organization = organizationService.getOrgInfo(user.getUsername());
//        model.addAttribute("organization", organization);
//        return "vihoorg/org_info";
//    }

    @RequestMapping(value = "/checkname", method = RequestMethod.GET)
    @ResponseBody
    public Boolean checkName(@RequestParam(value = "name") String name) {
        Boolean isOk = activityService.searchActivityByName(name);
        return isOk;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public Msg getInfo(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Organization organization = organizationService.getOrgInfo(user.getUsername());
        return Msg.success().add("organization", organization);
    }

    @RequestMapping(value = "/infoChange", method = RequestMethod.POST)
    @ResponseBody
    public Msg infoChange(@RequestParam(value = "name") String name,
                          @RequestParam(value = "introduction") String introduction,
                          Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Organization organization = new Organization();
        organization.setOrganizationName(name);
        organization.setOrganizationIntroduction(introduction);
        Boolean aBoolean = organizationService.changeInfo(user.getUsername(), organization);
        return Msg.success();
    }

}
