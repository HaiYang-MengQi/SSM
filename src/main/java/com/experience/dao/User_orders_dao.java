package com.experience.dao;

import com.experience.entity.User;

import java.util.List;

/**
 * @author 汪海洋
 */
public interface User_orders_dao {
    List<User> getOrders(int id);
}
