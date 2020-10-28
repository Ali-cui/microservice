package com.srcb.order.Mapper;

import com.srcb.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Ali.cui
 * @Date: 2020/10/27 18:03
 */
@Mapper
public interface OrderMapper {
    @Select("SELECT * FROM orders WHERE id=#{id} ")
     List<Order> getOrderById(@Param("id")Integer id);
}
