package com.ly.repository;


import com.ly.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
public interface OrderItemRepository extends JpaRepository<OrderItemEntity,OrderItemEntity.RelationPK> {
}
