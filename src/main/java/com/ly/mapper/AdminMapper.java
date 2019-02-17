package com.ly.mapper;

import com.ly.entity.Admin;
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
public interface AdminMapper extends BaseMapper<Admin> {

    @Select("select * from t_admin where admin_name = #{adminName}")
    public Admin findByAdminName(@Param("adminName") String adminName);
}
