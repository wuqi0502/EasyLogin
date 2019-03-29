package cn.hash.shark.mapper;

import cn.hash.shark.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface UserMapper {

    User getUser(Map<String, Object> map);

    int insertUser(Map<String, Object> map);

    User queryUserByUserName(String username);
}
