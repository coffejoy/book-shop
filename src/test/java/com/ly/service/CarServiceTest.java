package com.ly.service;

import com.ly.dto.CarDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void addCar(){

        CarDto carDto = new CarDto();
        carDto.setBookId(2L);
        carDto.setQuantity(1);
        carDto.setUserId(1L);
        carService.add(carDto);


    }

}
