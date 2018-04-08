package com.ly.service;

import com.ly.entity.OrderEntity;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
public interface OrderService {

    void buy(List<Integer> carIds);
    void buy(Integer carId,String orderId);
    List<OrderEntity> showOrder(Long userId);
    OrderEntity showOrder(String OrderId);
}
