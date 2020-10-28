package com.srcb.son;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: Ali.cui
 * @Date: 2020/10/28 9:16
 */
@RestController
public class ServcieController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/rest/{id}")
    public String sad(@PathVariable("id")Integer id){

        return restTemplate.getForObject("http://order/orderService/"+id,String.class);
    }
}
