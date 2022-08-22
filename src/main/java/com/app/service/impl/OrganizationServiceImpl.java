package com.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.app.entity.Organization;
import com.app.mapper.ActivityMapper;
import com.app.mapper.OrganizationMapper;
import com.app.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    ActivityMapper activityMapper;

    @Autowired
    OrganizationMapper organizationMapper;

    @Override
    public boolean saveBatch(Collection<Organization> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Organization> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Organization> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Organization entity) {
        return false;
    }

    @Override
    public Organization getOne(Wrapper<Organization> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Organization> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Organization> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Organization> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Organization> getEntityClass() {
        return null;
    }

    @Override
    public Object upAct(Map<Object, Object> map) {
        activityMapper.organization_insert_activity(map);
        return map.get("msg");
    }

    @Override
    public Integer getOrganizationNum(String id) {
        List<Organization> organizations = organizationMapper.selectByOrganizationId(id);
        return organizations.get(0).getOrganizationNum();
    }

    @Override
    public Boolean changeInfo(String id, Organization organization) {
        int i = organizationMapper.updateOrganizationNameAndOrganizationIntroductionByOrganizationId(organization.getOrganizationName(), organization.getOrganizationIntroduction(), id);
        return true;
    }

    @Override
    public Organization getOrgInfo(String id) {
        List<Organization> organizations = organizationMapper.selectByOrganizationId(id);
        return organizations.get(0);
    }


}
