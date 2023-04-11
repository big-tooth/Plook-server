package com.schuanhe.plook.service.impl;


import com.schuanhe.plook.entity.User;
import com.schuanhe.plook.mapper.UserMapper;
import com.schuanhe.plook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User Login(User user) {
        return userMapper.queryUserByUp(user);
    }

    @Override
    public User Register(User user) {
        if (userMapper.queryUserByUp(user) != null) {
            return user;
        } else {
            return userMapper.addUser(user);
        }
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

}
