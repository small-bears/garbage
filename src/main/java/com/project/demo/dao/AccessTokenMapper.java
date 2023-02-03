package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.AccessToken;

/**
 * 临时访问牌Mapper接口
 *
 */
public interface AccessTokenMapper extends BaseMapper<AccessToken>
{
    /**
     * 查询临时访问牌
     *
     * @param tokenId 临时访问牌ID
     * @return 临时访问牌
     */
    AccessToken selectAccessTokenById(Integer tokenId);

    /**
     * 查询临时访问牌列表
     *
     * @param accessToken 临时访问牌
     * @return 临时访问牌集合
     */
    List<AccessToken> selectAccessTokenList(AccessToken accessToken);

    /**
     * 新增临时访问牌
     *
     * @param accessToken 临时访问牌
     * @return 结果
     */
    int insertAccessToken(AccessToken accessToken);

    /**
     * 修改临时访问牌
     *
     * @param accessToken 临时访问牌
     * @return 结果
     */
    int updateAccessToken(AccessToken accessToken);

    /**
     * 删除临时访问牌
     *
     * @param tokenId 临时访问牌ID
     * @return 结果
     */
    int deleteAccessTokenById(Integer tokenId);

    /**
     * 批量删除临时访问牌
     *
     * @param tokenIds 需要删除的数据ID
     * @return 结果
     */
    int deleteAccessTokenByIds(Integer[] tokenIds);
}
