package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_register_service;
import com.experience.tool.RsaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.interfaces.RSAKey;

/***
 * 此类用于用户注册
 */

@Controller
public class User_register_Controller {
    @Autowired
    User_register_service user_register_service;
    @RequestMapping("/register")
    public String UserAdd(User user){
        RsaUtils r = new RsaUtils();
        user_register_service.userAdd(user);
        return "main";
    }
}
