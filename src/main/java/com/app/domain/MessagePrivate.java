package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName message_private
 */
@TableName(value ="message_private")
@Data
public class MessagePrivate implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer msgPrivateNum;

    /**
     * 
     */
    @TableId
    private Integer userNum;

    /**
     * 
     */
    @TableId
    private Integer userSwindleSwindleNum;

    /**
     * 
     */
    private String msgPrivateId;

    /**
     * 
     */
    private Integer msgUserNum;

    /**
     * 
     */
    private String msgPrivateDetail;

    /**
     * 
     */
    private Integer msgPrivateIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}