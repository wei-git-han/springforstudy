package com.example.han.springtest.controller;

import com.example.han.springtest.entity.User;
import com.example.han.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class UserController {

    /*@Autowired
    private UserMapper userMapper;*/

    @Autowired
    private UserService userService;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
         List<User> userList = userService.queryUserList();
         return userList;
    }

}
