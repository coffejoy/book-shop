package com.ly.service;

import com.ly.dto.CarDto;
import com.ly.entity.Car;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.vo.CarVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
public interface CarService extends IService<Car> {
    void add(CarDto carDto);
    List<CarVo> showcar(Long userId);
    Car getCar(Integer carId);
}
