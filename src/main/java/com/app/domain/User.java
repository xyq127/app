package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer userNum;

    /**
     * 
     */
    @TableId
    private Integer userCityNum;

    /**
     * 
     */
    @TableId
    private Integer userProvinceNum;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String isIdentify;

    /**
     * 
     */
    private String userGender;

    /**
     * 
     */
    private Date userRegisterdate;

    /**
     * 
     */
    private Date userBirth;

    /**
     * 
     */
    private String userTel;

    /**
     * 
     */
    private Integer userPostCount;

    /**
     * 
     */
    private Integer userAttentionCount;

    /**
     * 
     */
    private Integer userScoreCount;

    /**
     * 
     */
    private Integer userIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}