package project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import project.entity.User;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    @Select("select * from user_han where id = #{id}")
    List<User> getList(String id);
}
