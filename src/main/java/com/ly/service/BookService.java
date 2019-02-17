package com.ly.service;

import com.ly.dto.BookDto;
import com.ly.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
public interface BookService extends IService<Book> {

    void add(BookDto dto);

    List<Book> showBookList();

    Book showOneBook(Long id);

    void del(Long bookId);
}
