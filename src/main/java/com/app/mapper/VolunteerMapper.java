package com.app.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.app.entity.Volunteer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.app.entity.Volunteer
 */
@Repository
public interface VolunteerMapper extends BaseMapper<Volunteer> {

    List<Volunteer> selectByVolunteerName(@Param("volunteerName") String volunteerName);

    List<Volunteer> selectByVolunteerId(@Param("volunteerId") String volunteerId);

//    int checkSignupTel(String signupTel);

    int countByVolunteerTel(@Param("signUpTel") String signUpTel);

    int insertSelective(Volunteer volunteer);

    int volunteer_insert(Map map);//调用数据库中的volunteer_insert存储过程

    List<Volunteer> selectAllByVolunteerId(@Param("volunteerId") String volunteerId);



}




