package com.app.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName act_announcement
 */
@TableName(value ="act_announcement")
@Data
public class ActAnnouncement implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer actannouncementNum;

    /**
     * 
     */
    private Integer activityNum;

    /**
     * 
     */
    private String actannouncementId;

    /**
     * 
     */
    private String actannouncementName;

    /**
     * 
     */
    private String actannouncementDetail;

    /**
     * 
     */
    private Integer organizationNum;

    /**
     * 
     */
    @TableLogic
    private Integer actannouncementIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}