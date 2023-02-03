package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;


/**
 * (Upload)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("upload")
@Data
@EqualsAndHashCode(callSuper = false)
public class Upload implements Serializable {

    private static final long serialVersionUID = 924405862662825633L;

    /**
     * 上传ID
     */
    @TableId(value = "upload_id", type = IdType.AUTO)
    private Integer uploadId;

    /**
     * 文件名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 访问路径
     */
    @TableField(value = "path")
    private String path;

    /**
     * 文件路径
     */
    @TableField(value = "file")
    private String file;

    /**
     * 显示顺序
     */
    @TableField(value = "display")
    private String display;

    /**
     * 父级ID
     */
    @TableField(value = "father_id")
    private Integer fatherId;

    /**
     * 文件夹
     */
    @TableField(value = "dir")
    private String dir;

    /**
     * 文件类型
     */
    @TableField(value = "type")
    private String type;

}

