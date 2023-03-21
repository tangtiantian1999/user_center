package com.ttt.user_center_end;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ttt.user_center_end.mapper")
public class UserCenterEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterEndApplication.class, args);
    }

}
