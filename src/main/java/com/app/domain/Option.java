package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName option
 */
@TableName(value ="option")
@Data
public class Option implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer optionNum;

    /**
     * 
     */
    @TableId
    private Integer questionNum;

    /**
     * 
     */
    private String optionId;

    /**
     * 
     */
    private String optionDetail;

    /**
     * 
     */
    private String istrue;

    /**
     * 
     */
    private Integer optionIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}