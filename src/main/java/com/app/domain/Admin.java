package com.app.domain;

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
    @TableId
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

    /**
     * 
     */
    private Integer adminIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}