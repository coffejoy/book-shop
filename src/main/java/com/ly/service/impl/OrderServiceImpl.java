package com.ly.service.impl;

import com.ly.entity.*;
import com.ly.repository.BookRepository;
import com.ly.repository.OrderItemRepository;
import com.ly.repository.OrderRepository;
import com.ly.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
@Service
public class OrderServiceImpl implements OrderService {


    private OrderService orderService;

    @Autowired
    private CarService carService;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Override
    public void buy(Integer carId,String orderId) {
        //购物车类
        CarEntity carEntity = carService.getCar(carId);
        Long userId = carEntity.getUserId();
        Long bookId = carEntity.getBookId();
        Integer quantity = carEntity.getQuantity();

        //订单商品类
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        //获取商品id、商品名、商品价格
        BookEntity bookEntity = bookService.showOneBook(bookId);
        Double bookPrice = bookEntity.getBookPrice();
        String bookName = bookEntity.getBookName();
        Double bookCurrprice = bookEntity.getBookCurrprice();
        Double bookTotalPrice = bookCurrprice*quantity;

       // int allBookPrice += bookTotalPrice;

        orderItemEntity.setBookId(bookId);
        orderItemEntity.setOrderId(orderId);
        orderItemEntity.setQuantity(quantity);
        orderItemEntity.setBookPrice(bookPrice);
        orderItemEntity.setBookName(bookName);
        orderItemEntity.setBookCurrprice(bookCurrprice);
        orderItemEntity.setBookTotalPrice(bookTotalPrice);
        orderItemEntity.setCreateTime(new Date());
        orderItemEntity.setUpdateTime(new Date());
        orderItemRepository.save(orderItemEntity);

        //订单类
        OrderEntity orderEntity = orderRepository.findOne(orderId);
        if(orderEntity==null){
             orderEntity = new OrderEntity();
            //获取用户地址
            UserEntity userEntity = userService.showUser(userId);
            String userAddress = userEntity.getUserAddress();
            Integer status = 1;//商品状态为可购买
            Double totalPrice = bookTotalPrice;
            orderEntity.setOrderId(orderId);
            orderEntity.setUserId(userId);
            orderEntity.setUserAddress(userAddress);
            orderEntity.setOrderTime(new Date());
            orderEntity.setStatus(status);
            orderEntity.setTotalPrice(bookTotalPrice);
            orderEntity.setCreateTime(new Date());
            orderEntity.setUpdateTime(new Date());
            orderRepository.save(orderEntity);

        }
}




    @Override
    public void buy(List<Integer> carIds){
        String orderId = UUID.randomUUID().toString();

        for(Integer carId:carIds ){
            buy(carId,orderId);
        }


    }


    @Override
    public   List<OrderEntity> showOrder(Long userId) {
        return orderRepository.findAll();
    }
}
