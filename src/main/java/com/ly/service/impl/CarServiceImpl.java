package com.ly.service.impl;

import com.ly.dto.CarDto;
import com.ly.entity.CarEntity;
import com.ly.repository.CarRepository;
import com.ly.service.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void add(CarDto carDto) {

        CarEntity carEntity = new CarEntity();
        BeanUtils.copyProperties(carDto,carEntity);
        carEntity.setCreateTime(new Date());
        carEntity.setUpdateTime(new Date());
        carRepository.save(carEntity);

    }
}
