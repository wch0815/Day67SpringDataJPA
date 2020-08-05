package com.cheng.testservice;

import com.cheng.pojo.User;
import com.cheng.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jpa.xml")
public class TestService {

    @Autowired
    private IUserService userService;

    @Test
    public void getAllUsers(){

        List<User> list = userService.getAllUsers();
        for (User u:list) {
            System.out.println(u);
        }
    }
}
