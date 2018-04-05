package com.ly.service;

import com.ly.entity.UserEntity;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
public interface UserService {

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

}
