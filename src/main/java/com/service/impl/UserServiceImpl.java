package com.service.impl;

import com.entity.User;
import com.mapper.dao.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 将方法的运行结果存入缓存，以后只要是相同的数据，直接从缓存中获取
     * CacheManager管理多个缓存组件，对缓存的真正crud操作在cache组件中，每一个缓存组件有自己唯一的名字
     * 几个属性：
     * cacheNames：指定缓存组件的名字
     * key：缓存数据时使用的key，默认是使用方法的参数值 ，value是方法的返回值。
     * keyGenerator:key的生成器
     * @return
     */
    @Cacheable(cacheNames = "emp")
    public List<User> queryUserList(){
        List<User> list = userMapper.queryUserList();
        if(list ==null && list.size() == 0){
            return new ArrayList<>();
        }
        return list;
    }
}
