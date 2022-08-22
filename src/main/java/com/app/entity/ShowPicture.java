package com.app.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName show_picture
 */
@TableName(value ="show_picture")
@Data
public class ShowPicture implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer pictureNum;

    /**
     * 
     */
    private Integer showNum;

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
    @TableLogic
    private Integer pictureIsdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}