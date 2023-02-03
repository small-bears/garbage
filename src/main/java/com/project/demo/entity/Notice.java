package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 公告：(Notice)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("notice")
@Data
@EqualsAndHashCode(callSuper = false)
public class Notice implements Serializable {

    private static final long serialVersionUID = -51697340312239379L;

    /**
     * 公告id：
     */
    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;

    /**
     * 标题：
     */
    @TableField(value = "title")
    private String title;

    /**
     * 正文：
     */
    @TableField(value = "content")
    private String content;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

