package com.ly.service;

import com.ly.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userName
     * @param userPassword
     * @return
     */
    int register(String userName,String userPassword);

    /**
     * 用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    int login(String userName,String userPassword);

    User showUser(Long userId);//查找用户类
}
