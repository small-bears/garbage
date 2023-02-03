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
 *站点管理：(SiteManagement)表实体类
 *
 */
@TableName("`site_management`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SiteManagement implements Serializable {

    //SiteManagement编号
    @TableId(value = "site_management_id", type = IdType.AUTO)
    private Integer site_management_id;
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
    // 负责人
    @TableField(value = "person_in_charge")
    private String person_in_charge;
    // 照片
    @TableField(value = "photo")
    private String photo;
    // 联系电话
    @TableField(value = "contact_number")
    private String contact_number;
    // 站点介绍
    @TableField(value = "site_introduction")
    private String site_introduction;
    // 点击数
    @TableField(value = "hits")
    private Integer hits;
    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
