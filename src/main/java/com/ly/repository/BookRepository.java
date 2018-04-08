package com.ly.repository;

import com.ly.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
public interface BookRepository extends JpaRepository<BookEntity,Long> {


}
