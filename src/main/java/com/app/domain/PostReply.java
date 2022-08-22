package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName post_reply
 */
@TableName(value ="post_reply")
@Data
public class PostReply implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer replyNum;

    /**
     * 
     */
    @TableId
    private Integer postNum;

    /**
     * 
     */
    private String replyId;

    /**
     * 
     */
    private Integer inReplyNum;

    /**
     * 
     */
    private String replyDetail;

    /**
     * 
     */
    private Integer replyBrowse;

    /**
     * 
     */
    private Integer replyLike;

    /**
     * 
     */
    private Integer replyIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}