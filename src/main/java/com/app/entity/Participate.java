package com.app.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName participate
 */
@TableName(value ="participate")
@Data
public class Participate implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer participateNum;

    /**
     * 
     */
    private Integer volunteerNum;

    /**
     * 
     */
    private Integer activityNum;

    /**
     * 
     */
    private Date participateApplytime;

    /**
     * 
     */
    private String participateApplystate;

    /**
     * 
     */
    private Date participateApplychecktime;

    /**
     * 
     */
    private String participateTraining;

    /**
     * 
     */
    private Date participateBegintime;

    /**
     * 
     */
    private Date participateEndtime;

    /**
     * 
     */
    private Double participateDuration;

    /**
     * 
     */
    private String participateTimecheck;

    /**
     * 
     */
    @TableLogic
    private Integer participateIsdeleted;

    private Volunteer volunteer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}