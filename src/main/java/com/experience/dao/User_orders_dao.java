package com.experience.dao;

import com.experience.entity.Orders;
import com.experience.entity.User;

import java.util.List;

public interface User_orders_dao {
    List<User> getOrders(int id);
}
