package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Collect;

/**
 * 收藏：Mapper接口
 *
 */
public interface CollectMapper extends BaseMapper<Collect>
{
    /**
     * 查询收藏：
     *
     * @param collectId 收藏：ID
     * @return 收藏：
     */
    Collect selectCollectById(Integer collectId);

    /**
     * 查询收藏：列表
     *
     * @param collect 收藏：
     * @return 收藏：集合
     */
    List<Collect> selectCollectList(Collect collect);

    /**
     * 新增收藏：
     *
     * @param collect 收藏：
     * @return 结果
     */
    int insertCollect(Collect collect);

    /**
     * 修改收藏：
     *
     * @param collect 收藏：
     * @return 结果
     */
    int updateCollect(Collect collect);

    /**
     * 删除收藏：
     *
     * @param collectId 收藏：ID
     * @return 结果
     */
    int deleteCollectById(Integer collectId);

    /**
     * 批量删除收藏：
     *
     * @param collectIds 需要删除的数据ID
     * @return 结果
     */
    int deleteCollectByIds(Integer[] collectIds);
}
