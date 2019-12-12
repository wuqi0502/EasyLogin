package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.GenMapper;
import cn.hash.shark.service.GenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GenServiceImpl implements GenService {

    private Logger logger = LoggerFactory.getLogger(GenServiceImpl.class);

    @Resource
    private GenMapper genMapper;
}
