package com.ly.controller;

import com.ly.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/show")
    String showbook(Model model){
        model.addAttribute("lns",bookService.showBookList());
        return "/showbook";
    }

    @RequestMapping("/detail/{bookId}")
    String detail(@PathVariable("bookId") Long bookId,Model model){
        model.addAttribute("ly",bookService.showOneBook(bookId));
        return "/detail";
    }
}
