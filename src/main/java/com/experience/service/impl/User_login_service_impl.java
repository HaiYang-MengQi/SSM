package com.experience.service.impl;

import com.experience.dao.User_login_dao;
import com.experience.entity.User;
import com.experience.service.User_login_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_login_service_impl implements User_login_service {
    @Autowired
    private User_login_dao userlogindao;

    @Override
    public User findUser(User user) {
        return userlogindao.findUser(user);
    }
}
