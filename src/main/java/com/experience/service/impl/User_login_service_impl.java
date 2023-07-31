package com.experience.service.impl;

import com.experience.dao.Login;
import com.experience.entity.User;
import com.experience.service.User_login_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_login_service_impl implements User_login_service {
    @Autowired
    private Login login;

    @Override
    public User findUser(User user) {
        return login.findUser(user);
    }
}
