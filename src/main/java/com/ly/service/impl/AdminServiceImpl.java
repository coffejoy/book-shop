package com.ly.service.impl;

import com.ly.entity.Admin;
import com.ly.mapper.AdminMapper;
import com.ly.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int login(String adminName, String adminPassword) {

        int status = 0;
        if (StringUtils.isBlank(adminName) || StringUtils.isBlank(adminPassword)) {
            return status;//登录账号或密码为空
        }
        Admin admin = adminMapper.findByAdminName(adminName);

        if (admin == null || !adminPassword.equals(admin.getAdminPassword())) {
            return status;//账号不存在或密码错误
        } else {
            return 1;
        }
    }
}
