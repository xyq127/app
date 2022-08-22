package com.app.service;

import com.app.entity.Activity;
import com.app.entity.Participate;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface ParticipateService extends IService<Participate> {


    List<Participate> getVolunteerList(Integer activityNum);


    Object volCheckRecruit(Map<Object, Object> map);
}
