package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName answer
 */
@TableName(value ="answer")
@Data
public class Answer implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer userNum;

    /**
     * 
     */
    @TableId
    private Integer questionNum;

    /**
     * 
     */
    private Integer answerNum;

    /**
     * 
     */
    private String answerId;

    /**
     * 
     */
    private Integer optionNum;

    /**
     * 
     */
    private Integer answerIstrue;

    /**
     * 
     */
    private Date answerTime;

    /**
     * 
     */
    private Integer answerIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}