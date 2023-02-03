package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.ArticleType;

import java.util.List;

/**
 * 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。Mapper接口
 *
 */
public interface ArticleTypeMapper extends BaseMapper<ArticleType>
{
    /**
     * 查询文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     *
     * @param typeId 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。ID
     * @return 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     */
    ArticleType selectArticleTypeById(Integer typeId);

    /**
     * 查询文章频道：用于汇总浏览文章，在不同频道下展示不同文章。列表
     *
     * @param articleType 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     * @return 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。集合
     */
    List<ArticleType> selectArticleTypeList(ArticleType articleType);

    /**
     * 新增文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     *
     * @param articleType 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     * @return 结果
     */
    int insertArticleType(ArticleType articleType);

    /**
     * 修改文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     *
     * @param articleType 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     * @return 结果
     */
    int updateArticleType(ArticleType articleType);

    /**
     * 删除文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     *
     * @param typeId 文章频道：用于汇总浏览文章，在不同频道下展示不同文章。ID
     * @return 结果
     */
    int deleteArticleTypeById(Integer typeId);

    /**
     * 批量删除文章频道：用于汇总浏览文章，在不同频道下展示不同文章。
     *
     * @param typeIds 需要删除的数据ID
     * @return 结果
     */
    int deleteArticleTypeByIds(Integer[] typeIds);
}
