package com.experience.controller;

import com.experience.entity.Orders;
import com.experience.entity.User;
import com.experience.service.User_orders_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/***
 * 此类用来获取一对多的订单信息
 * @author 汪海洋
 *
 *
 */

@Controller
public class User_orders_Controller {
    @Autowired
    User_orders_service user_orders_service;

    /***
     * @param id
     * @return List
     *
     */
    @RequestMapping("/getList")
    public void getList(@RequestParam(value = "id",required = true) int id){
       List<User> orders = user_orders_service.getOrders(id);
       orders.stream().forEach(obj -> System.out.println(obj));
    }
}
