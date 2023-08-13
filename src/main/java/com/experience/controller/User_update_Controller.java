package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_update_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_update_Controller {
    @Autowired
    User_update_service user_update_service;
    @RequestMapping("/modify")
    private String modify(User user)
    {
        User u= new User();
        u.setId(3);
        u.setUsername("AAAAA");
        u.setPassword("AAAAA");
        u.setSex("男");
        user_update_service.modifyUser(u);
        return "forward:login.jsp";
    }
}
