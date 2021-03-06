package com.dxg.msns.user.service;

import com.dxg.msns.common.pojo.PageResult;
import com.dxg.msns.user.pojo.User;

public interface UserService {
    /**
     * 分页查询用户
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param isAll
     * @return
     */
    PageResult<User> queryUsersByPage(String key, Integer page, Integer rows, String[] sortBy, Boolean[] desc, Boolean isAll);

    /**
     * 根据用户名查询用户
     * @param user
     * @return
     */
    boolean findUserByName(User user);

    /**
     * 新增用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 修改用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param user
     */
    void deleteUser(User user);

    /**
     * 查询用户数据是否可用
     * @param data
     * @param type
     * @return
     */
    Boolean checkUserData(String data, Integer type);

    /**
     * 根据id查找用户
     * @param uid
     * @return
     */
    User queryNameAvatarById(String uid);
}
