package com.code.service;

import com.code.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
public interface UserService extends IService<User> {

    int getUserID();

    Boolean deleteUser(int id);


    User login(User user);


}
