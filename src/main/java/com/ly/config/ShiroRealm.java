package com.ly.config;

import com.ly.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>
 * title
 * </p>
 *
 * @author Michael Fang
 * @since 2018-04-10
 */
@Component
public class ShiroRealm extends AuthorizingRealm {

    private static final Logger LOGGER =  LoggerFactory.getLogger(ShiroRealm.class);

    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //通过用户名获取用户信息


        //读取用户角色信息


        //读取用户权限信息

        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户输入的用户信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName=token.getUsername();

        //通过用户名获取用户信息
        User user = null;
        if(user != null){
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(userName,user.getUserPassword(),getName());
        }else {
            return null;
        }

    }

}
