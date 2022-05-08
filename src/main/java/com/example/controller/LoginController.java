package com.example.controller;

import com.example.entity.User;
import com.example.entity.resp.ResponseResult;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public ResponseResult login(@RequestParam("username") String username,
                                @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        //登录操作
        return loginService.login(user);
    }


    @RequestMapping(value = "/user/logout",method = RequestMethod.GET)
    public ResponseResult logout() {
        return loginService.logout();
    }
}
