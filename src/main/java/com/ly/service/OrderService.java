package com.ly.service;

import com.ly.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.entity.OrderItem;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
public interface OrderService extends IService<Order> {

    void buy(List<Integer> carIds, Long userId);
    void buy(Integer carId,String orderId);
    List<Order> showOrder(Long userId);
    List<OrderItem> showOrderItem(String orderId);
}
