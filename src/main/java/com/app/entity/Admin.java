package com.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName admin
 */
@TableName(value ="admin")
@Data
public class Admin implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer adminNum;

    /**
     * 
     */
    private String adminId;

    /**
     * 
     */
    private String adminPassword;

    /**
     * 
     */
    private String adminName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}