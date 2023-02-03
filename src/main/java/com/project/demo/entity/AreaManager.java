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
 *片区管理者：(AreaManager)表实体类
 *
 */
@TableName("`area_manager`")
@Data
@EqualsAndHashCode(callSuper = false)
public class AreaManager implements Serializable {

    //AreaManager编号
    @TableId(value = "area_manager_id", type = IdType.AUTO)
    private Integer area_manager_id;
    // 管理者工号
    @TableField(value = "manager_job_number")
    private String manager_job_number;
    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
