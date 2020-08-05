package com.cheng.service.impl;

import com.cheng.dao.IUserDao;
import com.cheng.pojo.User;
import com.cheng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
