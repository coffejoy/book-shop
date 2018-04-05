package com.ly.service;

import com.ly.dto.BookDto;
import com.ly.entity.BookEntity;

import java.util.Date;
import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
public interface BookService {

    void add(BookDto dto);

    List<BookEntity> showBookList();

    BookEntity showOneBook(Long id);

    void del(Long bookId);

}
