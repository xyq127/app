package com.app.service;

import com.app.entity.Activity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface ActivityService extends IService<Activity> {

    List<Activity> getActivityByNumAndState(Integer num, String state);

    List<Activity> getActivityByState(String state);

    Boolean deleteAct(Integer num);

    List<Activity> activityInfo(Integer activityNum);


    Boolean searchActivityByName(String name);

    Object passActByAdminIdWithStatue(Map<Object, Object> map);

    Activity selectAct(String actName);
}
