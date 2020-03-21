package com.service.impl;

import com.entity.User;
import com.mapper.dao.UserMapper;
import com.service.UserService;
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
