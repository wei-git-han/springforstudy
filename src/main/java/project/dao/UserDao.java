package project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.entity.User;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    List<User> getList(String id);
}
