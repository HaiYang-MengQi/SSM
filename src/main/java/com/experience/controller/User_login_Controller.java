package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_login_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigInteger;


/**
 * 此类用于用户登录的功能
 * @author 汪海洋
 */
@Controller
public class User_login_Controller {
    @Autowired
    private User_login_service user_login_service;
    @RequestMapping(value = {"/login", "/userLogin"})
    private String login(@RequestParam(value = "username", required = true) String username, @RequestParam(value = "password",required = true) String password, HttpSession session) throws IOException {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
       User u = user_login_service.findUser(user);
       if(u != null){
           session.setAttribute("user", user);
           return "main";
       }
       else {
           return "login";
       }
    }
}
