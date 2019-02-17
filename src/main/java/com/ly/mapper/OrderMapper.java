package com.ly.mapper;

import com.ly.entity.Order;
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
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from t_order where user_id=#{userId}")
    List<Order> findAllByUserId(@Param("userId")Long userId);

    @Select("select * from t_order where user_id=#{orderId}")
    List<Order> findByOrderId(@Param("orderId") String orderId);
}
