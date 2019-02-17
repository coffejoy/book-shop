package com.ly.service.impl;

import com.ly.entity.User;
import com.ly.mapper.UserMapper;
import com.ly.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public int register(String userName, String userPassword) {
        int status;
        if( userMapper.findByUserName(userName)!=null){
            status = 0;//用户已存在
        }else {
            User userEntity = new User();
            userEntity.setUserName(userName);
            userEntity.setUserPassword(userPassword);
            userEntity.setStatus(1);
            userEntity.setCreateTime(new Date());
            userEntity.setUpdateTime(new Date());
            userMapper.insert(userEntity);
            status = 1;
        }
        return status;
    }

    @Override
    public int login(String userName, String userPassword) {
        int status = 0; //登录失败
        if(StringUtils.isBlank(userName)||StringUtils.isBlank(userPassword)){
            LOGGER.info("账号为空。");
            return status;//用户输入为空
        }
        User userEntity = userMapper.findByUserName(userName);
        if(userEntity==null){
            return status;//用户不存在
        }
        if(!userEntity.getUserPassword().equals(userPassword)){
            return status;//用户密码错误
        }
        int active = userEntity.getStatus();
        if(active ==0){
            status = 2;//未激活
        }else{
            status =1;//成功
        }
        return status;
    }

    @Override
    public User showUser(Long userId) {
        return userMapper.selectById(userId);
    }
}
