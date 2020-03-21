package com.example.han.springtest.controller;

import com.example.han.springtest.entity.User1;
import com.example.han.springtest.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService1 userService;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map){
        List<User1> userList = userService.getList("11");
        for (User1 user:userList){
            System.out.println(user.getName());
        }
        map.addAttribute("users",userList);
        return "user";
    }
}
