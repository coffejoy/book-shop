package com.ly.controller;

import com.ly.dto.CarDto;
import com.ly.service.BookService;
import com.ly.service.CarService;
import com.ly.vo.CarVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/5
 */
@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private BookService bookService;

    /**
     * 增加商品
     * @param carDto
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    String addCar(CarDto carDto){

        String success = "success";
        carService.add(carDto);

        return success;
    }

    /**
     * 展示购物车中商品
     * @param userId
     * @return
     */
    @RequestMapping("/show")
    @ResponseBody
    List<CarVo> showCar(Long userId){


       return carService.showcar(userId);

    }

    /**
     * 从购物车中删除单件商品
     */
    @RequestMapping("/delone")
    @ResponseBody
    String delone(Long bookId){

        String success = "success";
        bookService.del(bookId);
        return success;

    }



}
