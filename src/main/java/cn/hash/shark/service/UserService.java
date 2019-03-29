package cn.hash.shark.service;

import cn.hash.shark.pojo.User;

import java.util.Map;

public interface UserService {

    User getUser(Map<String, Object> map);

    int insertUser(Map<String, Object> map);

    User queryUserByUserName(String username);
}
