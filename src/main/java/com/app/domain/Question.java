package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer questionNum;

    /**
     * 
     */
    private String questionId;

    /**
     * 
     */
    private String questionDetail;

    /**
     * 
     */
    private Integer questionScore;

    /**
     * 
     */
    private Integer questionIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}