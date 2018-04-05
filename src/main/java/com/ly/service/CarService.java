package com.ly.service;

import com.ly.dto.CarDto;
import com.ly.entity.CarEntity;
import com.ly.vo.CarVo;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/30
 */
public interface CarService {

    void add(CarDto carDto);
    List<CarVo> showcar(Long userId);

}
