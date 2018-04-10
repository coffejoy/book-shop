package com.ly.service;

import com.ly.entity.OrderEntity;
import com.ly.entity.OrderItemEntity;
import com.ly.entity.UserEntity;
import com.ly.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/9
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void test(){

       // String orderId = UUID.randomUUID().toString();
        List<OrderItemEntity> list = orderService.showOrderItem("8b43d79e-4bb2-4c31-bba3-dfef8f18f17d");
        if (list != null) {
            //获取商品类商品总价格\
            Double allPrice = 0D;
            for (OrderItemEntity orderItemEntity : list) {
               allPrice += orderItemEntity.getBookTotalPrice();
            }
            //存储订单

            OrderEntity orderEntity =new OrderEntity();
           // String userAddress = userEntity.getUserAddress();
            Integer status = 1;//商品状态为可购买
            orderEntity.setOrderId("8b43d79e-4bb2-4c31-bba3-dfef8f18f17d");
            orderEntity.setUserId(1L);
            orderEntity.setUserAddress("dddd");
            orderEntity.setOrderTime(new Date());
            orderEntity.setStatus(status);
            orderEntity.setTotalPrice(allPrice);
            orderEntity.setCreateTime(new Date());
            orderEntity.setUpdateTime(new Date());
            orderRepository.save(orderEntity);

        }

    }

}
