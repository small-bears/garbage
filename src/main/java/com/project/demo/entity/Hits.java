package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 访问：(Hits)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("hits")
@Data
@EqualsAndHashCode(callSuper = false)
public class Hits implements Serializable {

    private static final long serialVersionUID = -48157238791857969L;

    /**
     * 访问ID：
     */
    @TableId(value = "hits_id", type = IdType.AUTO)
    private Integer hitsId;

    /**
     * 访问人：
     */
    @TableField(value = "user_id")
    private Integer userId;

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

    /**
     * 来源表：
     */
    @TableField(value = "source_table")
    private String sourceTable;

    /**
     * 来源字段：
     */
    @TableField(value = "source_field")
    private String sourceField;

    /**
     * 来源ID：
     */
    @TableField(value = "source_id")
    private Integer sourceId;

}

