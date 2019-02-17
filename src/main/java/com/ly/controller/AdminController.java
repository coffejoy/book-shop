package com.ly.controller;

import com.ly.dto.BookDto;
import com.ly.service.AdminService;
import com.ly.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/4
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AdminService adminService;

    @RequestMapping("/judgelogin")
    @ResponseBody
    int judgelogin(String adminName,String adminPassword){

        int status = adminService.login(adminName,adminPassword);
        return status;

    }

    @RequestMapping("/login")
    String adminlogin(){
        return "admin/login";
    }

    @RequestMapping("/addbooks")
    String addbooks(){
        return "addbooks";
    }


    @RequestMapping(value="/addbook",method = RequestMethod.POST)
    @ResponseBody
    String addBook(BookDto bookDto) {
        String Success = "success";
        bookService.add(bookDto);
        return Success;
    }

    @RequestMapping("/delbook")
    @ResponseBody
    String delbook(Long bookId){

        bookService.del(bookId);
        return  null;
    }

}
