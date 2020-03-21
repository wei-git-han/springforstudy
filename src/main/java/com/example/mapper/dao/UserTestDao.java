package com.example.mapper.dao;

import com.example.entity.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserTestDao {
    //@Select("select * from user_han where id = #{id}")
    List<UserTest> getList(String id);
}
