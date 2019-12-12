package cn.hash.shark.mapper;

import cn.hash.shark.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {

    User getUser(Map<String, Object> map);

    int insertUser(Map<String, Object> map);

    User queryUserByUserName(String username);
}
