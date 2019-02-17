package com.ly.mapper;

import com.ly.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
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
public interface BookMapper extends BaseMapper<Book> {

    @Select("select * from t_car")
    List<Book> selectAllCar();

}
