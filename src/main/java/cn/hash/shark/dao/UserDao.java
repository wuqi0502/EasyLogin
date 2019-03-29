package cn.hash.shark.dao;

import cn.hash.shark.pojo.User;

import java.util.Map;

public interface UserDao {

    User getUser(Map<String, Object> map);
}
