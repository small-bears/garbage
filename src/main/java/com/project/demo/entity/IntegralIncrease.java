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
 *积分增加：(IntegralIncrease)表实体类
 *
 */
@TableName("`integral_increase`")
@Data
@EqualsAndHashCode(callSuper = false)
public class IntegralIncrease implements Serializable {

    //IntegralIncrease编号
    @TableId(value = "integral_increase_id", type = IdType.AUTO)
    private Integer integral_increase_id;
    // 用户
    @TableField(value = "user")
    private Integer user;
    // 增加积分
    @TableField(value = "increase_points")
    private Integer increase_points;
    // 日期
    @TableField(value = "date")
    private Timestamp date;
    // 增加原因
    @TableField(value = "reason_for_increase")
    private String reason_for_increase;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
