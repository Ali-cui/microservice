package com.srcb.order.controller;

import com.srcb.order.Mapper.OrderMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


/**
 * @Author: Ali.cui
 * @Date: 2020/10/28 9:16
 */
@RestController
public class ServcieController {
    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("/orderService/{id}")
    public String or(@PathVariable("id") Integer id){
        System.out.println("第二"+new Date().getSeconds());
        System.out.println(orderMapper.getOrderById(id));
        return orderMapper.getOrderById(id).toString();
    }
}
