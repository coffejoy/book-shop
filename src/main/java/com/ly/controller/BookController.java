package com.ly.controller;

import com.ly.dto.BookDto;
import com.ly.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/test")
    @ResponseBody
    String give() {
        return "Hello World!";
    }

    @RequestMapping("/addbook")
    @ResponseBody
    String addBook(@Valid BookDto bookDto) {
        String Success = "success";
        bookService.add(bookDto);
        return Success;
    }




}
