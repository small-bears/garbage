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
 *积分商品：(IntegralGoods)表实体类
 *
 */
@TableName("`integral_goods`")
@Data
@EqualsAndHashCode(callSuper = false)
public class IntegralGoods implements Serializable {

    //IntegralGoods编号
    @TableId(value = "integral_goods_id", type = IdType.AUTO)
    private Integer integral_goods_id;
    // 商品编号
    @TableField(value = "commodity_number")
    private String commodity_number;
    // 商品名称
    @TableField(value = "trade_name")
    private String trade_name;
    // 所需积分
    @TableField(value = "required_points")
    private Integer required_points;
    // 图片
    @TableField(value = "picture")
    private String picture;
    // 品牌
    @TableField(value = "brand")
    private String brand;
    // 规格
    @TableField(value = "specifications")
    private String specifications;
    // 商品介绍
    @TableField(value = "product_introduction")
    private String product_introduction;
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
