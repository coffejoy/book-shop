package com.ly.service;

import com.alibaba.fastjson.JSON;
import com.ly.dto.BookDto;
import com.ly.entity.BookEntity;
import com.ly.service.impl.BookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAdd(){
        BookDto dto = new BookDto();
        dto.setBookAuthor("梭罗");
        dto.setBookName("瓦尔登湖");
        dto.setBookImg("cc");
        dto.setBookCurrprice(20d);
        dto.setBookPrice(40d);
        dto.setBookDiscount(0.5d);
        dto.setBookPublishTime(new Date());
        dto.setCateId(1);
        bookService.add(dto);

    }

    @Test
    public void testList(){
        List<BookEntity> list = bookService.showBookList();
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void testOne(){

        BookEntity book = bookService.showOneBook(2L);
        System.out.println(JSON.toJSONString(book));

    }

}
