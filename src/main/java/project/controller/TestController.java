package project.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import project.entity.User;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map){
        String sql = "select * from user_han";
        List<User> userList = jdbcTemplate.query(sql,new RowMapper<User>(){
            User user = null;
            public User mapRow(ResultSet rs, int rowNum) throws SQLException{
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setDeptId(rs.getString("deptId"));
                return user;
            }});
        for (User user:userList){
            System.out.println(user.getName());
        }
        map.addAttribute("users",userList);
        return "user";
    }
}
