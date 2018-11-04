package com.example.dbtest.service;

import com.example.dbtest.User;
import com.example.dbtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {

    @Autowired
    private UserMapper userMapper = null;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
