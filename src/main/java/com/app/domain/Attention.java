package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName attention
 */
@TableName(value ="attention")
@Data
public class Attention implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer attentionNum;

    /**
     * 
     */
    @TableId
    private Integer userNum;

    /**
     * 
     */
    private String attentionId;

    /**
     * 
     */
    private Integer attentionIsdeleted;

    /**
     * 
     */
    private Integer attentionUserNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}