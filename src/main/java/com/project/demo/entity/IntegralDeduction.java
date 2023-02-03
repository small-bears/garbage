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
 *积分扣减：(IntegralDeduction)表实体类
 *
 */
@TableName("`integral_deduction`")
@Data
@EqualsAndHashCode(callSuper = false)
public class IntegralDeduction implements Serializable {

    //IntegralDeduction编号
    @TableId(value = "integral_deduction_id", type = IdType.AUTO)
    private Integer integral_deduction_id;
    // 用户
    @TableField(value = "user")
    private Integer user;
    // 扣减积分
    @TableField(value = "deduction_points")
    private Integer deduction_points;
    // 日期
    @TableField(value = "date")
    private Timestamp date;
    // 扣减原因
    @TableField(value = "reason_for_deduction")
    private String reason_for_deduction;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
