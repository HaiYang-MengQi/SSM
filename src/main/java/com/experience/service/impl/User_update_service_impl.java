package com.experience.service.impl;

import com.experience.dao.User_update_dao;
import com.experience.entity.User;
import com.experience.service.User_update_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_update_service_impl implements User_update_service {
    @Autowired
    User_update_dao user_update_dao;

    @Override
    public void modifyUser(User user) {
        user_update_dao.modifyUser(user);
    }
}
