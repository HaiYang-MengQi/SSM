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


@Controller
public class User_login_Controller {
    @Autowired
    private User_login_service user_login_service;
    @RequestMapping(value = {"/login","/userLogin"})
    private void login(@RequestParam(value = "username",required = true) String username,@RequestParam(value = "password") String password, HttpSession session, HttpServletResponse response) throws IOException {// TODO 需要将此优化为类转化对象的传入方式,且设置@RequestParam属性指定必须要有的参数
         User user = new User();
         user.setUsername(username);
         user.setPassword(password);
        System.out.println(user_login_service.findUser(user).toString());
        }
}
