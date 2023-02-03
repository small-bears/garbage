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
 *积分兑换：(PointExchange)表实体类
 *
 */
@TableName("`point_exchange`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PointExchange implements Serializable {

    //PointExchange编号
    @TableId(value = "point_exchange_id", type = IdType.AUTO)
    private Integer point_exchange_id;
    // 订单编号
    @TableField(value = "order_number")
    private String order_number;
    // 商品名称
    @TableField(value = "trade_name")
    private String trade_name;
    // 所需积分
    @TableField(value = "required_points")
    private String required_points;
    // 收货人姓名
    @TableField(value = "consignee_name_")
    private String consignee_name_;
    // 收货地址
    @TableField(value = "receiving_address")
    private String receiving_address;
    // 联系电话
    @TableField(value = "contact_number")
    private String contact_number;
    // 用户名
    @TableField(value = "user_name")
    private Integer user_name;
    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;
    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
