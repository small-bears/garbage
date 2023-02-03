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
 *清运垃圾：(GarbageRemoval)表实体类
 *
 */
@TableName("`garbage_removal`")
@Data
@EqualsAndHashCode(callSuper = false)
public class GarbageRemoval implements Serializable {

    //GarbageRemoval编号
    @TableId(value = "garbage_removal_id", type = IdType.AUTO)
    private Integer garbage_removal_id;
    // 管理者工号
    @TableField(value = "manager_job_number")
    private Integer manager_job_number;
    // 站点名称
    @TableField(value = "site_name")
    private String site_name;
    // 地址
    @TableField(value = "address")
    private String address;
    // 状态
    @TableField(value = "state")
    private String state;
    // 清运时间
    @TableField(value = "clearance_time")
    private Timestamp clearance_time;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
