package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Article;

import java.util.List;

/**
 * 文章：用于内容管理系统的文章Mapper接口
 *
 */
public interface ArticleMapper extends BaseMapper<Article>
{
    /**
     * 查询文章：用于内容管理系统的文章
     *
     * @param articleId 文章：用于内容管理系统的文章ID
     * @return 文章：用于内容管理系统的文章
     */
    Article selectArticleById(Integer articleId);

    /**
     * 查询文章：用于内容管理系统的文章列表
     *
     * @param article 文章：用于内容管理系统的文章
     * @return 文章：用于内容管理系统的文章集合
     */
    List<Article> selectArticleList(Article article);

    /**
     * 新增文章：用于内容管理系统的文章
     *
     * @param article 文章：用于内容管理系统的文章
     * @return 结果
     */
    int insertArticle(Article article);

    /**
     * 修改文章：用于内容管理系统的文章
     *
     * @param article 文章：用于内容管理系统的文章
     * @return 结果
     */
    int updateArticle(Article article);

    /**
     * 删除文章：用于内容管理系统的文章
     *
     * @param articleId 文章：用于内容管理系统的文章ID
     * @return 结果
     */
    int deleteArticleById(Integer articleId);

    /**
     * 批量删除文章：用于内容管理系统的文章
     *
     * @param articleIds 需要删除的数据ID
     * @return 结果
     */
    int deleteArticleByIds(Integer[] articleIds);
}
