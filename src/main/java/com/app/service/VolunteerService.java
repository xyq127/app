package com.app.service;

import com.app.entity.Volunteer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
*
*
*/
public interface VolunteerService extends IService<Volunteer> {

    int checkSignupTel(String signUpTel);

    String signUp(String signUpName, String signUpTel, String signUpPassword);

    List<Volunteer> getVolNameById(String volunteerId);
}
