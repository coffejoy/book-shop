package com.ly.service.impl;

import com.ly.entity.AdminEntity;
import com.ly.repository.AdminRepository;
import com.ly.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    /**
     * 管理员登录
     * @param adminName
     * @param adminPassword
     * @return
     */
    @Override
    public int login(String adminName, String adminPassword) {

        int status = 0;
        if (StringUtils.isBlank(adminName) || StringUtils.isBlank(adminPassword)) {
            return status;//登录账号或密码为空
        }
        AdminEntity admin = adminRepository.findByAdminName(adminName);

        if (admin == null || !adminPassword.equals(admin.getAdminPassword())) {
            return status;//账号不存在或密码错误
        } else {
            return 1;
        }

    }
}
