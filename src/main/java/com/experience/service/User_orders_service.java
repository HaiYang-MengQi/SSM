package com.experience.service;

import com.experience.entity.User;

import java.util.List;

public interface User_orders_service {
    List<User> getOrders(int id);
}
