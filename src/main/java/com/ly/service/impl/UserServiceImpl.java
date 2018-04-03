package com.ly.service.impl;

import com.ly.entity.UserEntity;
import com.ly.repository.UserRepository;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public int register(String userName, String userPassword) {

        int status;
       if( userRepository.findByUserName(userName)!=null){
           status = 0;//用户已存在
       }else {
           UserEntity userEntity = new UserEntity();
           userEntity.setUserName(userName);
           userEntity.setUserPassword(userPassword);
           userEntity.setActiveCode("123");
           userEntity.setStatus(1);
           userEntity.setCreateTime(new Date());
           userEntity.setUpdateTime(new Date());

           status = 1;
       }
        return status;
    }
}
