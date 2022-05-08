package com.example.controller;

import com.example.entity.User;
import com.example.entity.resp.ResponseResult;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录相关接口
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public ResponseResult login(@RequestBody User user) {
        //登录操作
        return loginService.login(user);
    }


    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public ResponseResult logout() {
        return loginService.logout();
    }
}
