package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName swindle
 */
@TableName(value ="swindle")
@Data
public class Swindle implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer swindleNum;

    /**
     * 
     */
    private String swindleId;

    /**
     * 
     */
    private String swindleName;

    /**
     * 
     */
    private String swindleRoutine;

    /**
     * 
     */
    private String swindleTips;

    /**
     * 
     */
    private Integer swindleIsdeletedd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}