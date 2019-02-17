package com.ly.service.impl;

import com.ly.dto.CarDto;
import com.ly.entity.Book;
import com.ly.entity.Car;
import com.ly.mapper.CarMapper;
import com.ly.service.BookService;
import com.ly.service.CarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.ly.vo.CarVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private BookService bookService;

    @Override
    public void add(CarDto carDto) {

        Long bookId = carDto.getBookId();
        Long userId = carDto.getUserId();
        //1.查找购物车中是否存在此商品
        Car carEntity = carMapper.findByBookIdAndUserId(bookId, userId);
        //2.若有则覆盖

        if (carEntity != null) {
            Integer quantity = carEntity.getQuantity();
            carEntity.setQuantity(quantity + carDto.getQuantity());//数量加一
            carMapper.insert(carEntity);
        } else { //3.若没有则添加
            carEntity = new Car();

            BeanUtils.copyProperties(carDto, carEntity);
            carEntity.setCreateTime(new Date());
            carEntity.setUpdateTime(new Date());
            carMapper.insert(carEntity);
        }
    }

    @Override
    public List<CarVo> showcar(Long userId) {
        List<CarVo> voList = new ArrayList<CarVo>();
        List<Car> list = carMapper.findByUserId(userId);

        for (Car carEntity : list) {
            Long bId = carEntity.getBookId();
            CarVo carVo = new CarVo();
            Book bookEntity = bookService.showOneBook(bId);
            BeanUtils.copyProperties(carEntity, carVo);
            BeanUtils.copyProperties(bookEntity, carVo);
            voList.add(carVo);
        }
        return voList;
    }

    @Override
    public Car getCar(Integer carId) {
        return carMapper.findByCarId(carId);
    }
}
