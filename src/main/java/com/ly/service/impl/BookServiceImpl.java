package com.ly.service.impl;

import com.ly.dto.BookDto;
import com.ly.entity.BookEntity;
import com.ly.repository.BookRepository;
import com.ly.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * 添加图书
     * @param dto
     */
    @Override
    public void add(BookDto dto) {
        BookEntity entity = new BookEntity();
        BeanUtils.copyProperties(dto,entity);
        entity.setCreateTime(new Date());
        entity.setUpdateTime(new Date());
        bookRepository.save(entity);
    }



    /**
     * 展示图书
     */
    @Override
    public List<BookEntity> showBookList() {

        List<BookEntity> list = bookRepository.findAll();

        return list;

    }

    @Override
    public BookEntity showOneBook(Long id) {

        BookEntity bookEntity = bookRepository.findOne(id);

        return bookEntity;
    }

    @Override
    public void del(Long bookId) {
        bookRepository.delete(bookId);
    }

}
