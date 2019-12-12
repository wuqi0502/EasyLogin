package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.UserMapper;
import cn.hash.shark.pojo.User;
import cn.hash.shark.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(Map<String, Object> map) {
        return this.userMapper.getUser(map);
    }

    @Override
    public int insertUser(Map<String, Object> map) {
        return this.userMapper.insertUser(map);
    }

    @Override
    public User queryUserByUserName(String username) {
        return this.userMapper.queryUserByUserName(username);
    }
}
