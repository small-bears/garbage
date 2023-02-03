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
 *预约回收：(ReservationRecycling)表实体类
 *
 */
@TableName("`reservation_recycling`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ReservationRecycling implements Serializable {

    //ReservationRecycling编号
    @TableId(value = "reservation_recycling_id", type = IdType.AUTO)
    private Integer reservation_recycling_id;
    // 管理者工号
    @TableField(value = "manager_job_number")
    private Integer manager_job_number;
    // 站点名称
    @TableField(value = "site_name")
    private String site_name;
    // 废品名称
    @TableField(value = "scrap_name")
    private String scrap_name;
    // 数量
    @TableField(value = "number")
    private String number;
    // 用户名
    @TableField(value = "user_name")
    private Integer user_name;
    // 联系电话
    @TableField(value = "contact_number")
    private String contact_number;
    // 上门地址
    @TableField(value = "address")
    private String address;
    // 预约上门时间
    @TableField(value = "make_an_appointment_for_door_to_door_time")
    private String make_an_appointment_for_door_to_door_time;
    // 状态
    @TableField(value = "state")
    private String state;
    // 获得积分
    @TableField(value = "get_points")
    private Integer get_points;
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
