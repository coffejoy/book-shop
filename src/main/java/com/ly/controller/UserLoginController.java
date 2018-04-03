package com.ly.controller;

import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "/userlogin";
    }

    @RequestMapping("/judgelogin")
    @ResponseBody
    String judgeLogin(String username,String password){

    }


}
