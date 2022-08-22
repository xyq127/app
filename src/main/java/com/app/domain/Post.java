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
 * @TableName post
 */
@TableName(value ="post")
@Data
public class Post implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer postNum;

    /**
     * 
     */
    @TableId
    private Integer userUserNum;

    /**
     * 
     */
    @TableId
    private Integer userSwindleSwindleNum;

    /**
     * 
     */
    @TableId
    private Integer userCityCityNum;

    /**
     * 
     */
    @TableId
    private Integer userProvinceProvinceNum;

    /**
     * 
     */
    private String postId;

    /**
     * 
     */
    private Integer swindleNum;

    /**
     * 
     */
    private Integer userNum;

    /**
     * 
     */
    private Date postTime;

    /**
     * 
     */
    private String postName;

    /**
     * 
     */
    private String postDetail;

    /**
     * 
     */
    private Integer postBrowse;

    /**
     * 
     */
    private Integer postLike;

    /**
     * 
     */
    private Integer postIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}