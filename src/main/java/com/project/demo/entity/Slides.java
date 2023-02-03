package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 轮播图：(Slides)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("slides")
@Data
@EqualsAndHashCode(callSuper = false)
public class Slides implements Serializable {

    private static final long serialVersionUID = -75647097161026943L;

    /**
     * 轮播图ID：
     */
    @TableId(value = "slides_id", type = IdType.AUTO)
    private Integer slidesId;

    /**
     * 标题：
     */
    @TableField(value = "title")
    private String title;

    /**
     * 内容：
     */
    @TableField(value = "content")
    private String content;

    /**
     * 链接：
     */
    @TableField(value = "url")
    private String url;

    /**
     * 轮播图：
     */
    @TableField(value = "img")
    private String img;

    /**
     * 点击量：
     */
    @TableField(value = "hits")
    private Integer hits;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

