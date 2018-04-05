package com.ly.controller;

import com.ly.dto.BookDto;
import com.ly.entity.BookEntity;
import com.ly.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

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
