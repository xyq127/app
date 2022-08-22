package com.app.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName organization
 */
@TableName(value ="organization")
@Data
public class Organization implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer organizationNum;

    /**
     * 
     */
    private String organizationId;

    /**
     * 
     */
    private String organizationPassword;

    /**
     * 
     */
    private String organizationName;

    /**
     * 
     */
    private Date organizationEstablishdate;

    /**
     * 
     */
    private String organizationIntroduction;

    /**
     * 
     */
    @TableLogic
    private Integer organizationIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}