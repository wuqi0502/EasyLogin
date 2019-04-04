package cn.hash.shark.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface MessageMapper {

    int insert(Map<String, Object> parameters);
}
