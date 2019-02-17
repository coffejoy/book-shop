package com.ly.mapper;

import com.ly.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user where user_name = #{username}")
    User findByUserName(@Param("username")String username);
}
