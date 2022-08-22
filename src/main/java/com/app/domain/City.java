package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName city
 */
@TableName(value ="city")
@Data
public class City implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer cityNum;

    /**
     * 
     */
    private String cityId;

    /**
     * 
     */
    private String cityName;

    /**
     * 
     */
    private Integer cityIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}