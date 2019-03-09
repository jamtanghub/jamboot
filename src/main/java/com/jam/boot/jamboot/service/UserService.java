package com.jam.boot.jamboot.service;

import com.jam.boot.jamboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getOne(){
        User user = new User();
        user.setId(1);
        user.setUserName("小王");
        user.setPhone("13512344321");
        user.setEmail("123456@163.com");
        return  user;
    }

}
