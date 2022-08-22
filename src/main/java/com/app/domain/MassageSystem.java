package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName massage_system
 */
@TableName(value ="massage_system")
@Data
public class MassageSystem implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer sysMessageNum;

    /**
     * 
     */
    private String sysMessageId;

    /**
     * 
     */
    private Integer userNum;

    /**
     * 
     */
    private String sysMessageDetail;

    /**
     * 
     */
    private Integer sysMessageIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}