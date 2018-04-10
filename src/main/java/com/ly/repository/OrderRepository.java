package com.ly.repository;

import com.ly.entity.OrderEntity;
import com.ly.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/29
 */
public interface OrderRepository extends JpaRepository<OrderEntity,String> {

    List<OrderEntity> findAllByUserId(Long userId);

    List<OrderEntity> findByOrderId(String orderId);

}
