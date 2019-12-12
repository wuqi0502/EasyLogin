package cn.hash.shark.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName DruidConfig
 * @Description Druid配置类
 * @Author wuq
 * @Date 2019-04-05 08:26
 * @Version 1.0
 */
//@Configuration
public class DruidConfig {

    private static final Logger logger = LoggerFactory.getLogger(DruidConfig.class);

    @Value(value = "${spring.datasource.url:#{null}}")
    private String dbUrl;

    @Value(value = "${spring.datasource.username:#{null}}")
    private String username;

    @Value(value = "${spring.datasource.password:#{null}}")
    private String password;
}
