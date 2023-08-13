package com.experience.service.impl;

import com.experience.dao.User_register_dao;
import com.experience.entity.User;
import com.experience.service.User_register_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_register_service_impl implements User_register_service {
    @Autowired
    User_register_dao user_register_dao;
    @Override
    public int userAdd(User user) {
        return user_register_dao.userAdd(user);
    }
}
