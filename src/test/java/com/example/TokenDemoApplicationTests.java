package com.example;

import com.example.entity.User;
import com.example.mapper.MenuMapper;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class TokenDemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    MenuMapper menuMapper;

    //测试MP是否正常
    @Test
    void testMp() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void PasswordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("xxx");
        System.out.println(encode);
    }


    @Test
    void testMapper() {
        List<String> list = menuMapper.selectPermsByUserId(3L);
        System.out.println(list);
    }

}
