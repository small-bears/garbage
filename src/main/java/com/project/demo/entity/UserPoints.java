package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 *用户积分：(UserPoints)表实体类
 *
 */
@TableName("`user_points`")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserPoints implements Serializable {

    //UserPoints编号
    @TableId(value = "user_points_id", type = IdType.AUTO)
    private Integer user_points_id;
    // 用户
    @TableField(value = "user")
    private Integer user;
    // 积分
    @TableField(value = "integral")
    private Integer integral;
    // 备注
    @TableField(value = "remarks")
    private String remarks;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
