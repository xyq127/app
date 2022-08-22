package com.app.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.app.entity.Organization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.app.entity.Organization
 */
@Repository
public interface OrganizationMapper extends BaseMapper<Organization> {

    List<Organization> selectByOrganizationName(@Param("organizationName") String organizationName);

    List<Organization> selectByOrganizationId(@Param("organizationId") String organizationId);

    int updateOrganizationNameAndOrganizationIntroductionByOrganizationId(@Param("organizationName") String organizationName, @Param("organizationIntroduction") String organizationIntroduction, @Param("organizationId") String organizationId);

    ;

}




