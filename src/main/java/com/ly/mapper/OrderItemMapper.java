package com.ly.mapper;

import com.ly.entity.OrderItem;
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
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    @Select("select * from t_order_item where order_id = #{orderId}")
    List<OrderItem> findAllByOrderId(@Param("orderId")String orderId);
}
