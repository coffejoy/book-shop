package com.ly.service.impl;

import com.ly.dto.CarDto;
import com.ly.entity.BookEntity;
import com.ly.entity.CarEntity;
import com.ly.repository.CarRepository;
import com.ly.service.BookService;
import com.ly.service.CarService;
import com.ly.vo.CarVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Autowired
    private BookService bookService;

    @Override
    public void add(CarDto carDto) {

        Long bookId = carDto.getBookId();
        Long userId = carDto.getUserId();
        //1.查找购物车中是否存在此商品
        CarEntity carEntity = carRepository.findByBookIdAndUserId(bookId, userId);
        //2.若有则覆盖

        if (carEntity != null) {
            Integer quantity = carEntity.getQuantity();
            carEntity.setQuantity(quantity + carDto.getQuantity());//数量加一
            carRepository.save(carEntity);
        } else { //3.若没有则添加
            carEntity = new CarEntity();

            BeanUtils.copyProperties(carDto, carEntity);
            carEntity.setCreateTime(new Date());
            carEntity.setUpdateTime(new Date());
            carRepository.save(carEntity);
        }
    }

    @Override
    public List<CarVo> showcar(Long userId) {

        List<CarVo> voList = new ArrayList<CarVo>();
        List<CarEntity> list = carRepository.findByUserId(userId);

        for (CarEntity carEntity : list) {
            Long bId = carEntity.getBookId();
            CarVo carVo = new CarVo();
            BookEntity bookEntity = bookService.showOneBook(bId);
            BeanUtils.copyProperties(carEntity, carVo);
            BeanUtils.copyProperties(bookEntity, carVo);
            voList.add(carVo);


        }


        return voList;
    }

    @Override
    public CarEntity getCar(Integer carId) {


        return carRepository.findByCarId(carId);
    }


}
