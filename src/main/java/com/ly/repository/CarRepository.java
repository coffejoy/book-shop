package com.ly.repository;

import com.ly.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
public interface CarRepository extends JpaRepository<CarEntity,CarEntity.RelationPK> {

    List<CarEntity> findByUserId(Long userId);
    CarEntity findByBookIdAndUserId(Long bookId,Long userId);
    CarEntity findByCarId(Integer carId);

}
