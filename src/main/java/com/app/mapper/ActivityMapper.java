package com.app.mapper;
import org.apache.ibatis.annotations.Param;

import com.app.entity.Activity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.app.entity.Activity
 */
@Repository
public interface ActivityMapper extends BaseMapper<Activity> {

    void demo_proc_add_activity(Map map) ;

//  void demo_select(Map map);

    @Select({ "call e_volunteer.demo_select(#{organizationId,mode=IN,jdbcType=VARCHAR})" })
    @Options(statementType= StatementType.CALLABLE)
    List<Activity> demo_select(Map map);


    //调用数据库中的organization_insert_activity存储过程
    void organization_insert_activity(Map map);

    //根据志愿者组织的id号来查询她所有的申报过的活动（包括审核通过和未通过的）
    List<Activity> selectAllByOrganizationNum(@Param("organizationNum") Integer organizationNum);

    //根据志愿者组织的id号和状态码来查询他申报的活动
//    List<Activity> selectAllByOrganizationNumAndActivityState(@Param("organizationNum") Integer organizationNum, @Param("activityState") String activityState);
    List<Activity> selectAllByOrganizationNumAndActivityStateAndActivityIsdeleted(@Param("organizationNum") Integer organizationNum, @Param("activityState") String activityState, @Param("activityIsdeleted") Integer activityIsdeleted);

    List<Activity> selectAllByActivityStateAndActivityIsdeleted(@Param("activityState") String activityState, @Param("activityIsdeleted") Integer activityIsdeleted);

    //根据activity的主键num来查询该活动的所有数据
    List<Activity> selectByActivityNum(@Param("activityNum") Integer activityNum);

    int updateActivityIsdeletedByActivityNum(@Param("activityIsdeleted") Integer activityIsdeleted, @Param("activityNum") Integer activityNum);

    List<Activity> selectAllByActivityName(@Param("activityName") String activityName);

    //调用数据库中的admin_check_activity存储过程
    void admin_check_activity(Map map);

    List<Activity> selectByActivityName(@Param("activityName") String activityName);

    ;
}
