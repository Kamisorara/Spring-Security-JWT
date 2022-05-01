package com.example.controller;

import com.example.entity.User;
import com.example.entity.resp.ResponseResult;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/user/login")
    public ResponseResult login(@RequestBody User user) {
        //登录操作
        return loginService.login(user);
    }


    @RequestMapping("/user/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }
}
