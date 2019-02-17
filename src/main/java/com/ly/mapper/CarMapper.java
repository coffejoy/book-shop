package com.ly.mapper;

import com.ly.entity.Car;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Mapper
public interface CarMapper extends BaseMapper<Car> {

    @Select("select * from t_car where user_id = #{userId}")
    List<Car> findByUserId(@Param("userId")Long userId);

    @Select("select * from t_car where book_id = #{bookId} and user_id = #{userId}")
    Car findByBookIdAndUserId(@Param("bookId")Long bookId, @Param("userId")Long userId);

    @Select("select * from t_car where car_id = #{carId}")
    Car findByCarId(@Param("carId")Integer carId);
}
