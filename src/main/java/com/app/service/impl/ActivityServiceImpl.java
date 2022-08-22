package com.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.app.entity.Activity;
import com.app.mapper.ActivityMapper;
import com.app.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityMapper activityMapper;


    @Override
    public boolean saveBatch(Collection<Activity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Activity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Activity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Activity entity) {
        return false;
    }

    @Override
    public Activity getOne(Wrapper<Activity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Activity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Activity> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Activity> getEntityClass() {
        return null;
    }

    @Override
    public List<Activity> getActivityByNumAndState(Integer num, String state) {
        return activityMapper.selectAllByOrganizationNumAndActivityStateAndActivityIsdeleted(num, state, 0);
    }

    @Override
    public List<Activity> getActivityByState(String state) {
        return activityMapper.selectAllByActivityStateAndActivityIsdeleted(state, 0);
    }

    @Override
    public List<Activity> activityInfo(Integer activityNum) {
        return activityMapper.selectByActivityNum(activityNum);
    }

    @Override
    public Boolean searchActivityByName(String name) {
        List<Activity> activities = activityMapper.selectAllByActivityName(name);
        if (activities.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object passActByAdminIdWithStatue(Map<Object, Object> map) {
        activityMapper.admin_check_activity(map);
        return map.get("msg");
    }

    @Override
    public Activity selectAct(String actName) {
        List<Activity> activities = activityMapper.selectByActivityName(actName);
        return activities.get(0);
    }

    @Override
    public Boolean deleteAct(Integer num) {
        int i = activityMapper.updateActivityIsdeletedByActivityNum(1, num);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }
}
