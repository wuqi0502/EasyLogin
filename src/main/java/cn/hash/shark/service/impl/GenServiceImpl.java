package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.GenMapper;
import cn.hash.shark.service.GenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenServiceImpl implements GenService {

    private Logger logger = LoggerFactory.getLogger(GenServiceImpl.class);

    @Autowired
    private GenMapper genMapper;
}
