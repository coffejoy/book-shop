package com.ly.repository;

import com.ly.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
public interface BookRepository extends JpaRepository<BookEntity,Long> {


}
