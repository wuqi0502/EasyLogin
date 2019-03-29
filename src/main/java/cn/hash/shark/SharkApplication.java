package cn.hash.shark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement    // 开启事务管理
public class SharkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharkApplication.class, args);
    }

}
