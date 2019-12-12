package cn.hash.shark.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MessageMapper {

    int insert(Map<String, Object> parameters);
}
