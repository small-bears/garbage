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
 *垃圾管理：(WasteManagement)表实体类
 *
 */
@TableName("`waste_management`")
@Data
@EqualsAndHashCode(callSuper = false)
public class WasteManagement implements Serializable {

    //WasteManagement编号
    @TableId(value = "waste_management_id", type = IdType.AUTO)
    private Integer waste_management_id;
    // 垃圾名称
    @TableField(value = "garbage_name")
    private String garbage_name;
    // 垃圾类型
    @TableField(value = "garbage_type")
    private String garbage_type;
    // 图片
    @TableField(value = "picture")
    private String picture;
    // 是否可回收
    @TableField(value = "is_it_recyclable")
    private String is_it_recyclable;
    // 垃圾危害
    @TableField(value = "garbage_hazard")
    private String garbage_hazard;
    // 处置方法
    @TableField(value = "disposal_method")
    private String disposal_method;
    // 详情
    @TableField(value = "details")
    private String details;
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
