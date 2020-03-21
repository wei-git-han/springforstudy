package com.example.han.springtest.service.impl;

import com.example.han.springtest.entity.User;
import com.example.han.springtest.mapper.dao.UserMapper;
import com.example.han.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserList(){
        List<User> list = userMapper.queryUserList();
        if(list ==null && list.size() == 0){
            return new ArrayList<>();
        }
        return list;
    }
}
