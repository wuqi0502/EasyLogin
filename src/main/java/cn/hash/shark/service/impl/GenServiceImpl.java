package cn.hash.shark.service.impl;

import cn.hash.shark.mapper.GenMapper;
import cn.hash.shark.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenServiceImpl implements GenService {

    @Autowired
    private GenMapper genMapper;
}
