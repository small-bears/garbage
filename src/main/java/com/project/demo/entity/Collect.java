package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 收藏：(Collect)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("collect")
@Data
@EqualsAndHashCode(callSuper = false)
public class Collect implements Serializable {

    private static final long serialVersionUID = -52185721730058036L;

    /**
     * 收藏ID：
     */
    @TableId(value = "collect_id", type = IdType.AUTO)
    private Integer collectId;

    /**
     * 收藏人ID：
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 来源表：
     */
    @TableField(value = "source_table")
    private String sourceTable;

    /**
     * 来源字段：
     */
    @TableField(value = "source_field")
    private String sourceField;

    /**
     * 来源ID：
     */
    @TableField(value = "source_id")
    private Integer sourceId;

    /**
     * 标题：
     */
    @TableField(value = "title")
    private String title;

    /**
     * 封面：
     */
    @TableField(value = "img")
    private String img;

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

