package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.MessageMapper;
import cn.hash.shark.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int insertMessage(Map<String, Object> parameters) {
        return this.messageMapper.insert(parameters);
    }
}
