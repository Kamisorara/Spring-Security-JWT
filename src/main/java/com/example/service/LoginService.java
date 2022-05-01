package com.example.service;

import com.example.entity.User;
import com.example.entity.resp.ResponseResult;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
