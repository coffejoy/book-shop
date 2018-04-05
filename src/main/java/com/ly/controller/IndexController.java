package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/5
 */
@Controller
public class IndexController {


    @RequestMapping("/index")
    String getindex(){

        return "/index";
    }

}
