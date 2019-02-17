package com.ly.service.impl;

import com.ly.dto.BookDto;
import com.ly.entity.Book;
import com.ly.mapper.BookMapper;
import com.ly.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void add(BookDto dto) {
        Book book = new Book();
        BeanUtils.copyProperties(dto,book);
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        bookMapper.insert(book);
    }

    @Override
    public List<Book> showBookList() {
        List<Book> list = bookMapper.selectAllCar();
        return list;
    }

    @Override
    public Book showOneBook(Long id) {

        Book bookEntity = bookMapper.selectById(id);
        return bookEntity;
    }

    @Override
    public void del(Long bookId) {
        bookMapper.deleteById(bookId);
    }
}
