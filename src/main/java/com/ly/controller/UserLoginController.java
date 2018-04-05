package com.ly.controller;

import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/3
 */
@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    String userRegister(){
        return "/userregister";
    }

    @RequestMapping("/registermanage")
    @ResponseBody
    public int judgeRegister(String userName,String userPassword){

        int status = userService.register(userName,userPassword);
        return status;
    }

    @RequestMapping("/login")
    String userLogin(){
        return "user/login";
    }

    @RequestMapping("/judgelogin")
    @ResponseBody
    int judgeLogin(String userName, String userPassword, HttpServletResponse response){
        int status = userService.login(userName,userPassword);
        if(status==1){
            Cookie cookie = new Cookie("login","success");
            response.addCookie(cookie);
        }
        return status;
    }


}
