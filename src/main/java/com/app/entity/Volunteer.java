package com.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName volunteer
 */
@TableName(value ="volunteer")
@Data
public class Volunteer implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer volunteerNum;

    /**
     * 
     */
    private String volunteerId;

    /**
     * 
     */
    private String volunteerPassword;

    /**
     * 
     */
    private String volunteerName;

    /**
     * 
     */
    private Date volunteerRegisterdate;

    /**
     * 
     */
    private String volunteerGender;

    /**
     * 
     */
    private Date volunteerBirth;

    /**
     *
     */
    private String volunteerTel;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}