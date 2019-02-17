package com.ly.service.impl;

import com.ly.entity.*;
import com.ly.mapper.OrderItemMapper;
import com.ly.mapper.OrderMapper;
import com.ly.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private CarService carService;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Override
    public void buy(List<Integer> carIds, Long userId) {
        String orderId = UUID.randomUUID().toString();

        for (Integer carId : carIds) {
            buy(carId, orderId);
        }

        //计算商品总价格
        List<OrderItem> list = orderService.showOrderItem(orderId);
        Double allPrice = 0D;
        if (list != null) {
            //获取商品类商品总价格
            for (OrderItem orderItemEntity : list) {
                allPrice += orderItemEntity.getBookTotalPrice();
            }
            //存储订单
            Order orderEntity = new Order();
            //获取用户地址
            User userEntity = userService.showUser(userId);
            String userAddress = userEntity.getUserAddress();
            Integer status = 1;//商品状态为可购买
            orderEntity.setOrderId(orderId);
            orderEntity.setUserId(userId);
            orderEntity.setUserAddress(userAddress);
            orderEntity.setOrderTime(new Date());
            orderEntity.setStatus(status);
            orderEntity.setTotalPrice(allPrice);
            orderEntity.setCreateTime(new Date());
            orderEntity.setUpdateTime(new Date());
            orderMapper.insert(orderEntity);

        }
    }

    @Override
    public void buy(Integer carId, String orderId) {
        //购物车类
        Car carEntity = carService.getCar(carId);
        Long userId = carEntity.getUserId();
        Long bookId = carEntity.getBookId();
        Integer quantity = carEntity.getQuantity();
        //订单商品类
        OrderItem orderItemEntity = new OrderItem();
        //获取商品id、商品名、商品价格
        Book bookEntity = bookService.showOneBook(bookId);
        Double bookPrice = bookEntity.getBookPrice();
        String bookName = bookEntity.getBookName();
        Double bookCurrprice = bookEntity.getBookCurrprice();
        Double bookTotalPrice = bookCurrprice * quantity;
        orderItemEntity.setBookId(bookId);
        orderItemEntity.setOrderId(orderId);
        orderItemEntity.setQuantity(quantity);
        orderItemEntity.setBookPrice(bookPrice);
        orderItemEntity.setBookName(bookName);
        orderItemEntity.setBookCurrprice(bookCurrprice);
        orderItemEntity.setBookTotalPrice(bookTotalPrice);
        orderItemEntity.setCreateTime(new Date());
        orderItemEntity.setUpdateTime(new Date());
        orderItemMapper.insert(orderItemEntity);
    }

    @Override
    public List<Order> showOrder(Long userId) {
        return orderMapper.findAllByUserId(userId);
    }

    @Override
    public List<OrderItem> showOrderItem(String orderId) {
        return orderItemMapper.findAllByOrderId(orderId);
    }
}
