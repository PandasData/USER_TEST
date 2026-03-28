package com.example.oracletest.service;

import com.example.oracletest.entity.User;
import com.example.oracletest.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getById(Long id) {
        return userMapper.findById(id);
    }

    public List<User> getAll() {
        return userMapper.findAll();
    }

    public void add(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}