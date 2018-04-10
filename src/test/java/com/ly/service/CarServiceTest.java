package com.ly.service;

import com.ly.dto.CarDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CarServiceTest {

    @Autowired
    private CarService carService;

    @Autowired
    private OrderService orderService;

    @Test
    public void addCar(){

        CarDto carDto = new CarDto();
        carDto.setBookId(2L);
        carDto.setQuantity(1);
        carDto.setUserId(1L);
        carService.add(carDto);


    }

    @Test
    public void buy(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Long userId = 1L;
        orderService.buy(list,userId);

    }
}
