package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName province
 */
@TableName(value ="province")
@Data
public class Province implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer provinceNum;

    /**
     * 
     */
    private String provinceId;

    /**
     * 
     */
    private String provinceName;

    /**
     * 
     */
    private Integer provinceIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}