package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.MessageMapper;
import cn.hash.shark.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Resource
    private MessageMapper messageMapper;

    @Override
    public int insertMessage(Map<String, Object> parameters) {
        return this.messageMapper.insert(parameters);
    }
}
