package com.ly.repository;

import com.ly.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
@Repository
public interface CarRepository extends JpaRepository<CarEntity,CarEntity.RelationPK> {
}
