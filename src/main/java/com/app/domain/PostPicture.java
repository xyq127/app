package com.app.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName post_picture
 */
@TableName(value ="post_picture")
@Data
public class PostPicture implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer pictureNum;

    /**
     * 
     */
    private String pictureId;

    /**
     * 
     */
    private String pictureName;

    /**
     * 
     */
    private String pictureRoute;

    /**
     * 
     */
    private String pictureUniquename;

    /**
     * 
     */
    private Integer pictureIsdeleted;

    /**
     * 
     */
    private Integer postNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}