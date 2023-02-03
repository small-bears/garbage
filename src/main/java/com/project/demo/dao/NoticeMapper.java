package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Notice;

/**
 * 公告：Mapper接口
 *
 */
public interface NoticeMapper extends BaseMapper<Notice>
{
    /**
     * 查询公告：
     *
     * @param noticeId 公告：ID
     * @return 公告：
     */
    Notice selectNoticeById(Integer noticeId);

    /**
     * 查询公告：列表
     *
     * @param notice 公告：
     * @return 公告：集合
     */
    List<Notice> selectNoticeList(Notice notice);

    /**
     * 新增公告：
     *
     * @param notice 公告：
     * @return 结果
     */
    int insertNotice(Notice notice);

    /**
     * 修改公告：
     *
     * @param notice 公告：
     * @return 结果
     */
    int updateNotice(Notice notice);

    /**
     * 删除公告：
     *
     * @param noticeId 公告：ID
     * @return 结果
     */
    int deleteNoticeById(Integer noticeId);

    /**
     * 批量删除公告：
     *
     * @param noticeIds 需要删除的数据ID
     * @return 结果
     */
    int deleteNoticeByIds(Integer[] noticeIds);
}
