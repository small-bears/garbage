package com.project.demo.dao;

import java.util.List;

import com.project.demo.entity.Upload;
import com.project.demo.dao.base.BaseMapper;

/**
 * 【请填写功能名称】Mapper接口
 *
 */
public interface UploadMapper extends BaseMapper<Upload>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param uploadId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    Upload selectUploadById(Long uploadId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param upload 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    List<Upload> selectUploadList(Upload upload);

    /**
     * 新增【请填写功能名称】
     *
     * @param upload 【请填写功能名称】
     * @return 结果
     */
    int insertUpload(Upload upload);

    /**
     * 修改【请填写功能名称】
     *
     * @param upload 【请填写功能名称】
     * @return 结果
     */
    int updateUpload(Upload upload);

    /**
     * 删除【请填写功能名称】
     *
     * @param uploadId 【请填写功能名称】ID
     * @return 结果
     */
    int deleteUploadById(Long uploadId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param uploadIds 需要删除的数据ID
     * @return 结果
     */
    int deleteUploadByIds(Long[] uploadIds);
}
