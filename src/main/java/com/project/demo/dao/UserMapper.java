package com.project.demo.dao;

import java.util.List;

import com.project.demo.entity.User;
import com.project.demo.dao.base.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户账户：用于保存用户登录信息Mapper接口
 *
 */
public interface UserMapper extends BaseMapper<User>
{
    /**
     * 查询用户账户：用于保存用户登录信息
     *
     * @param userId 用户账户：用于保存用户登录信息ID
     * @return 用户账户：用于保存用户登录信息
     */
    User selectUserById(Integer userId);

    /**
     * 查询用户账户：用于保存用户登录信息列表
     *
     * @param user 用户账户：用于保存用户登录信息
     * @return 用户账户：用于保存用户登录信息集合
     */
    List<User> selectUserList(User user);

    /**
     * 新增用户账户：用于保存用户登录信息
     *
     * @param user 用户账户：用于保存用户登录信息
     * @return 结果
     */
    int insertUser(User user);

    /**
     * 修改用户账户：用于保存用户登录信息
     *
     * @param user 用户账户：用于保存用户登录信息
     * @return 结果
     */
    int updateUser(User user);

    /**
     * 删除用户账户：用于保存用户登录信息
     *
     * @param userId 用户账户：用于保存用户登录信息ID
     * @return 结果
     */
    int deleteUserById(Integer userId);

    /**
     * 批量删除用户账户：用于保存用户登录信息
     *
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    int deleteUserByIds(Integer[] userIds);

    String selectExamineState(@Param("sourceTable") String sourceTable, @Param("userId") Integer userId);
}
