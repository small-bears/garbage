package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 文章：用于内容管理系统的文章(Article)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("article")
@Data
@EqualsAndHashCode(callSuper = false)
public class Article implements Serializable {

    private static final long serialVersionUID = 974130093549945724L;


    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;


    @TableId(value = "title")
    private String title;

    /**
     * 文章分类：[0,1000]用来搜索指定类型的文章
     */
    @TableField(value = "type")
    private String type;


    /**
     * 点击数：[0,1000000000]访问这篇文章的人次
     */
    @TableField(value = "hits")
    private Integer hits;

    /**
     * 点赞数
     */
    @TableField(value = "praise_len")
    private Integer praise_len;


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


    /**
     * 来源：[0,255]文章的出处
     */
    @TableField(value = "source")
    private String source;


    /**
     * 来源地址：[0,255]用于跳转到发布该文章的网站
     */
    @TableField(value = "url")
    private String url;


    /**
     * 标签：[0,255]用于标注文章所属相关内容，多个标签用空格隔开
     */
    @TableField(value = "tag")
    private String tag;


    /**
     * 正文：文章的主体内容
     */
    @TableField(value = "content")
    private String content;


    /**
     * 封面图
     */
    @TableField(value = "img")
    private String img;


    /**
     * 文章描述
     */
    @TableField(value = "description")
    private String description;


}

