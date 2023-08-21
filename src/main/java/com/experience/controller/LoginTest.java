package com.experience.controller;

import com.experience.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginTest {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "/denglu")
    public void login()
    {
        loginService.login();
    }
}
