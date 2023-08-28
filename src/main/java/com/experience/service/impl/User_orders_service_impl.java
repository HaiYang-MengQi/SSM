package com.experience.service.impl;

import com.experience.dao.User_orders_dao;
import com.experience.entity.User;
import com.experience.service.User_orders_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 汪海洋
 */
@Service
public class User_orders_service_impl implements User_orders_service {
    @Autowired
    User_orders_dao user_orders_dao;

    @Override
    public List<User> getOrders(int id) {
        return user_orders_dao.getOrders(id);
    }
}
