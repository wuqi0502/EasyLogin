package cn.hash.shark.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DruidConfig
 * @Description Druid配置类
 * @Author wuq
 * @Date 2019-04-05 08:26
 * @Version 1.0
 */
@Configuration
public class DruidConfig {

    private Logger logger = LoggerFactory.getLogger(DruidConfig.class);

    @Value("${spring.datasource.url:#{null}}")
    private String dbUrl;

    @Value("${spring.datasource.username:#{null}}")
    private String username;

    @Value("${spring.datasource.password:#{null}}")
    private String password;
}
