package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Comment;

/**
 * 评论：Mapper接口
 *
 */
public interface CommentMapper extends BaseMapper<Comment>
{
    /**
     * 查询评论：
     *
     * @param commentId 评论：ID
     * @return 评论：
     */
    Comment selectCommentById(Long commentId);

    /**
     * 查询评论：列表
     *
     * @param comment 评论：
     * @return 评论：集合
     */
    List<Comment> selectCommentList(Comment comment);

    /**
     * 新增评论：
     *
     * @param comment 评论：
     * @return 结果
     */
    int insertComment(Comment comment);

    /**
     * 修改评论：
     *
     * @param comment 评论：
     * @return 结果
     */
    int updateComment(Comment comment);

    /**
     * 删除评论：
     *
     * @param commentId 评论：ID
     * @return 结果
     */
    int deleteCommentById(Long commentId);

    /**
     * 批量删除评论：
     *
     * @param commentIds 需要删除的数据ID
     * @return 结果
     */
    int deleteCommentByIds(Long[] commentIds);
}
