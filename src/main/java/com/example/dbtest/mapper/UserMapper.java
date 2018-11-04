package com.example.dbtest.mapper;

import com.example.dbtest.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User getUser(Long id);
}
