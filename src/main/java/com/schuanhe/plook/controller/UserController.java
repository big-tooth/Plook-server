package com.schuanhe.plook.controller;

import com.schuanhe.plook.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserMapper mapper;

}
