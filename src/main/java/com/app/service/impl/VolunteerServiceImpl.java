package com.app.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.app.entity.Volunteer;
import com.app.mapper.VolunteerMapper;
import com.app.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    @Autowired
    VolunteerMapper volunteerMapper;


    @Override
    public boolean saveBatch(Collection<Volunteer> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Volunteer> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Volunteer> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Volunteer entity) {
        return false;
    }

    @Override
    public Volunteer getOne(Wrapper<Volunteer> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Volunteer> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Volunteer> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Volunteer> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Volunteer> getEntityClass() {
        return null;
    }

    @Override
    public int checkSignupTel(String signUpTel) {
        return volunteerMapper.countByVolunteerTel(signUpTel);
    }

    @Override
    public String signUp(String signUpName, String signUpTel, String signUpPassword) {
//        Volunteer volunteer = new Volunteer();
//        volunteer.setVolunteerName(signUpName);
//        volunteer.setVolunteerTel(signUpTel);
//        volunteer.setVolunteerPassword(signUpPassword);
//        return volunteerMapper.insertSelective(volunteer);
        Map<Object, Object> map = new HashMap<>();
        map.put("volunteerName",signUpName);
        map.put("volunteerTel",signUpTel);
        map.put("volunteerPassword",signUpPassword);
        volunteerMapper.volunteer_insert(map);//调用volunteer_insert存储过程
        return (String) map.get("volunteerId");
    }

    @Override
    public List<Volunteer> getVolNameById(String volunteerId) {

        return volunteerMapper.selectAllByVolunteerId(volunteerId);
    }

}
