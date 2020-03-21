package com.example.han.springtest.service;

import com.example.han.springtest.entity.User1;
import com.example.han.springtest.mapper.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService1 {

    @Autowired
    private UserDao userDao;

    public List<User1> getList(String id){
        return userDao.getList(id);
    }

}
