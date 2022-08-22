package com.app.service;

import com.app.entity.Organization;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 *
 */
public interface OrganizationService extends IService<Organization> {

    Object upAct(Map<Object, Object> map);

    Organization getOrgInfo(String id);

    Integer getOrganizationNum(String id);

    Boolean changeInfo(String id,Organization organization);
}
