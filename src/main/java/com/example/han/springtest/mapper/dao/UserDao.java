package com.example.han.springtest.mapper.dao;

import com.example.han.springtest.entity.User1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    //@Select("select * from user_han where id = #{id}")
    List<User1> getList(String id);
}
