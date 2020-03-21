package com.example.service;

import com.example.entity.UserTest;
import com.example.mapper.dao.UserTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTestService {

    @Autowired
    private UserTestDao userDao;

    public List<UserTest> getList(String id){
        return userDao.getList(id);
    }

}
