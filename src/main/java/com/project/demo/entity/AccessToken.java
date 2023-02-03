package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 临时访问牌(AccessToken)表实体类
 *
 */
@TableName("access_token")
@Data
@EqualsAndHashCode(callSuper = false)
public class AccessToken implements Serializable {

    private static final long serialVersionUID = 913269304437207500L;

    /**
     * 临时访问牌ID
     */
    @TableId(value = "token_id", type = IdType.AUTO)
    private Integer tokenId;

    /**
     * 临时访问牌
     */
    @TableField(value = "token")
    private String token;

    /**
     * 最大寿命：默认2小时
     */
    @TableField(value = "maxage")
    private Integer maxage;

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
     * 用户信息
     */
    @TableField(value = "user_id")
    private Integer user_id;

}
