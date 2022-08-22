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
 * @TableName activity
 */
@TableName(value ="activity")
@Data
public class Activity implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer activityNum;

    /**
     * 
     */
    private Integer organizationNum;

    /**
     * 
     */
    private String activityId;

    /**
     * 
     */
    private String activityName;

    /**
     * 
     */
    private String activityDetail;

    /**
     * 
     */
    private Date activityBegintime;

    /**
     * 
     */
    private Date activityEndtime;

    /**
     * 
     */
    private String activityLocation;

    /**
     * 
     */
    private Integer activityNeedpeople;

    /**
     * 
     */
    private String activityNotice;

    /**
     * 
     */
    private Date activityPublishtime;

    /**
     * 
     */
    private Date activitySignddl;

    /**
     * 
     */
    private String activityState;

    /**
     * 
     */
    private Integer adminNum;

    /**
     * 
     */
    private String activityCheckin;

    /**
     * 
     */
    private Integer activityLeaderid;

    /**
     * 
     */
    private Date activityChecktime;

    /**
     * 
     */
    private String activityRemark;

    /**
     * 
     */
    private Integer activityIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}