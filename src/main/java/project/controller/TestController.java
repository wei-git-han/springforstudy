package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.entity.User;
import project.service.serviceImpl.UserService;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map){
        List<User> userList = userService.getList("11");
        for (User user:userList){
            System.out.println(user.getName());
        }
        map.addAttribute("users",userList);
        return "user";
    }
}
