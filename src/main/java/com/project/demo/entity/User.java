package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 用户账户：用于保存用户登录信息(User)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("user")
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = -82540585424852966L;

    /**
     * 用户ID：[0,8388607]用户获取其他与用户相关的数据
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 账户状态：[0,10](1可用|2异常|3已冻结|4已注销)
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 所在用户组：[0,32767]决定用户身份和权限
     */
    @TableField(value = "user_group")
    private String userGroup;

    /**
     * 上次登录时间：
     */
    @TableField(value = "login_time")
    private Timestamp loginTime;

    /**
     * 手机号码：[0,11]用户的手机号码，用于找回密码时或登录时
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 手机认证：[0,1](0未认证|1审核中|2已认证)
     */
    @TableField(value = "phone_state")
    private Integer phoneState;

    /**
     * 用户名：[0,16]用户登录时所用的账户名称
     */
    @TableField(value = "username")
    private String username;

    /**
     * 昵称：[0,16]
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 密码：[0,32]用户登录所需的密码，由6-16位数字或英文组成
     */
    @TableField(value = "password")
    private String password;

    /**
     * 邮箱：[0,64]用户的邮箱，用于找回密码时或登录时
     */
    @TableField(value = "email")
    private String email;

    /**
     * 邮箱认证：[0,1](0未认证|1审核中|2已认证)
     */
    @TableField(value = "email_state")
    private Integer emailState;

    /**
     * 头像地址：[0,255]
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp createTime;

    @TableField(exist = false)
    private String code;
}

