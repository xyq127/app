package com.app.mapper;

import com.app.entity.Activity;
import com.app.entity.Participate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.app.entity.Participate
 */
@Repository
public interface ParticipateMapper extends BaseMapper<Participate> {

    List<Participate> selectParticipateWithVolunteerByActivityNum(Integer activityNum);

    //调用数据库中的organization_check_volunteer存储过程
    void organization_check_volunteer(Map map);

}




