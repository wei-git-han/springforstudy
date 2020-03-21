package com.example.controller;

import com.example.entity.UserTest;
import com.example.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserTestService userService;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map){
        List<UserTest> userList = userService.getList("11");
        for (UserTest user:userList){
            System.out.println(user.getName());
        }
        map.addAttribute("users",userList);
        return "user";
    }
}
