package com.schuanhe.Plook.service.impl;


import com.schuanhe.Plook.entity.User;
import com.schuanhe.Plook.mapper.UserMapper;
import com.schuanhe.Plook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User Login(User user) {
        return userMapper.queryUserByUp(user);
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

}
