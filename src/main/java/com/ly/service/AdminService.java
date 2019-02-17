package com.ly.service;

import com.ly.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
public interface AdminService extends IService<Admin> {

    int login(String adminName,String adminPassword);

}
