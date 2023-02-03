package com.project.demo.dao;

import java.util.List;

import com.project.demo.entity.UserGroup;
import com.project.demo.dao.base.BaseMapper;

/**
 * 用户组：用于用户前端身份和鉴权Mapper接口
 *
 */
public interface UserGroupMapper extends BaseMapper<UserGroup>
{
    /**
     * 查询用户组：用于用户前端身份和鉴权
     *
     * @param groupId 用户组：用于用户前端身份和鉴权ID
     * @return 用户组：用于用户前端身份和鉴权
     */
    UserGroup selectUserGroupById(Integer groupId);

    /**
     * 查询用户组：用于用户前端身份和鉴权列表
     *
     * @param userGroup 用户组：用于用户前端身份和鉴权
     * @return 用户组：用于用户前端身份和鉴权集合
     */
    List<UserGroup> selectUserGroupList(UserGroup userGroup);

    /**
     * 新增用户组：用于用户前端身份和鉴权
     *
     * @param userGroup 用户组：用于用户前端身份和鉴权
     * @return 结果
     */
    int insertUserGroup(UserGroup userGroup);

    /**
     * 修改用户组：用于用户前端身份和鉴权
     *
     * @param userGroup 用户组：用于用户前端身份和鉴权
     * @return 结果
     */
    int updateUserGroup(UserGroup userGroup);

    /**
     * 删除用户组：用于用户前端身份和鉴权
     *
     * @param groupId 用户组：用于用户前端身份和鉴权ID
     * @return 结果
     */
    int deleteUserGroupById(Integer groupId);

    /**
     * 批量删除用户组：用于用户前端身份和鉴权
     *
     * @param groupIds 需要删除的数据ID
     * @return 结果
     */
    int deleteUserGroupByIds(Integer[] groupIds);
}
