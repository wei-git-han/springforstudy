package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/userList1")
    public List<Map<String,Object>> userList(){
        String sql = "select * from user_han";
        List<Map<String,Object>> map = jdbcTemplate.queryForList(sql);
        return map;
    }
}
