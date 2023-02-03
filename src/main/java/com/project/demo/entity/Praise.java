package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 点赞：(Praise)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("praise")
@Data
@EqualsAndHashCode(callSuper = false)
public class Praise implements Serializable {

    private static final long serialVersionUID = -48157238791857969L;

    /**
     * 点赞ID：
     */
    @TableId(value = "praise_id", type = IdType.AUTO)
    private Integer praiseId;

    /**
     * 点赞人：
     */
    @TableField(value = "user_id")
    private Integer userId;

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
     * 点赞状态:1为点赞，0已取消
     */
    @TableField(value = "status")
    private Integer status;

}

