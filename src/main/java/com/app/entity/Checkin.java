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
 * @TableName checkin
 */
@TableName(value ="checkin")
@Data
public class Checkin implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer checkinNum;

    /**
     * 
     */
    private Integer participateNum;

    /**
     * 
     */
    private Date checkinBegintime;

    /**
     * 
     */
    private Date checkinEndtime;

    /**
     * 
     */
    private Double checkinDuration;

    /**
     * 
     */
    private String checkinTimecheck;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}