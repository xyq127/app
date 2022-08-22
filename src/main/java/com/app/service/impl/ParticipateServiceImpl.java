package com.app.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.app.entity.Activity;
import com.app.entity.Participate;
import com.app.mapper.ParticipateMapper;
import com.app.service.ParticipateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class ParticipateServiceImpl implements ParticipateService {

    @Autowired
    ParticipateMapper participateMapper;



    @Override
    public boolean saveBatch(Collection<Participate> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Participate> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Participate> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Participate entity) {
        return false;
    }

    @Override
    public Participate getOne(Wrapper<Participate> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Participate> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Participate> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Participate> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Participate> getEntityClass() {
        return null;
    }


    @Override
    public List<Participate> getVolunteerList(Integer activityNum) {
        System.out.println("!!!!!!!!!!!!!!");
        System.out.println(activityNum);
        return participateMapper.selectParticipateWithVolunteerByActivityNum(activityNum);
    }

    @Override
    public Object volCheckRecruit(Map<Object, Object> map) {
        participateMapper.organization_check_volunteer(map);
        return map.get("msg");
    }

}
