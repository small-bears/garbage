package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 用户组：用于用户前端身份和鉴权(UserGroup)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("user_group")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserGroup implements Serializable {

    private static final long serialVersionUID = 968356951391304707L;

    /**
     * 用户组ID：[0,8388607]
     */
    @TableId(value = "group_id", type = IdType.AUTO)
    private Integer groupId;

    /**
     * 显示顺序：[0,1000]
     */
    @TableField(value = "display")
    private Integer display;

    /**
     * 名称：[0,16]
     */
    @TableField(value = "name")
    private String name;

    /**
     * 描述：[0,255]描述该用户组的特点或权限范围
     */
    @TableField(value = "description")
    private String description;

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
     * 注册位置:
     */
    @TableField(value = "register")
    private String register;

    /**
     * 创建时间:
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间:
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

