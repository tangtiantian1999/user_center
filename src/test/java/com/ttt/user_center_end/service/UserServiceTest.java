package com.ttt.user_center_end.service;
import java.util.Date;

import com.ttt.user_center_end.model.domian.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
//@RunWith(SpringRunner.class)
@MapperScan("com.ttt.user_center_end.mapper")
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){

        User user = new User();
        user.setUsername("dog");
        user.setUserAccount("123");
        user.setAvatarUrl("");
        user.setGender(0);
        user.setUserPassword("123");
        user.setEmail("123");
        user.setPhone("123");

        boolean result = userService.save(user);
        assertTrue(result);
        System.out.println(result);
    }

    @Test
    void userRegister() {
        String userAccount = "yupi";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "1111";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "yu";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "yupi";
        userPassword = "123456";
        result = userService .userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "yu pi";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "dogyupi";
        userPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertEquals(-1, result);

        userAccount = "yupi";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        assertTrue(result>0);
    }
}