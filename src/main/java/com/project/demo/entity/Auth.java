package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 定制授权(Auth)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("auth")
@Data
@EqualsAndHashCode(callSuper = false)
public class Auth implements Serializable {

    private static final long serialVersionUID = -95935855259958194L;

    /**
     * 授权ID：
     */
    @TableId(value = "auth_id", type = IdType.AUTO)
    private Integer authId;

    /**
     * 用户组：
     */
    @TableField(value = "user_group")
    private String userGroup;

    /**
     * 模块名：
     */
    @TableField(value = "mod_name")
    private String modName;

    /**
     * 表名：
     */
    @TableField(value = "table_name")
    private String tableName;

    /**
     * 页面标题：
     */
    @TableField(value = "page_title")
    private String pageTitle;

    /**
     * 路由路径：
     */
    @TableField(value = "path")
    private String path;

	/**
	 * 位置：
	 */
    @TableField(value = "position")
	private String position;

	/**
	 * 跳转方式：
	 */
    @TableField(value = "mode")
	private String mode;

    /**
     * 是否可增加：
     */
    @TableField(value = "add")
    private Integer add;

    /**
     * 是否可删除：
     */
    @TableField(value = "del")
    private Integer del;

    /**
     * 是否可修改：
     */
    @TableField(value = "set")
    private Integer set;

    /**
     * 是否可查看：
     */
    @TableField(value = "get")
    private Integer get;

    /**
     * 添加字段：
     */
    @TableField(value = "field_add")
    private String fieldAdd;

    /**
     * 修改字段：
     */
    @TableField(value = "field_set")
    private String fieldSet;

    /**
     * 查询字段：
     */
    @TableField(value = "field_get")
    private String fieldGet;

    /**
     * 跨表导航名称：
     */
    @TableField(value = "table_nav_name")
    private String tableNavName;

    /**
     * 是否跨表操作：
     */
    @TableField(value = "table_nav")
    private Boolean tableNav;

    /**
     * 配置：
     */
    @TableField(value = "option")
    private String option;

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

