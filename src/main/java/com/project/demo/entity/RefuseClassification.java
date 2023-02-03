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
 *垃圾分类：(RefuseClassification)表实体类
 *
 */
@TableName("`refuse_classification`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RefuseClassification implements Serializable {

    //RefuseClassification编号
    @TableId(value = "refuse_classification_id", type = IdType.AUTO)
    private Integer refuse_classification_id;
    // 垃圾类型
    @TableField(value = "garbage_type")
    private String garbage_type;


    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;

}
