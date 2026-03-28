package com.example.oracletest.controller;

import com.example.oracletest.entity.User;
import com.example.oracletest.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 查询单个
    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.getById(id);
    }

    // 查询全部
    @GetMapping("/list")
    public List<User> list() {
        return userService.getAll();
    }

    // 新增
    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.add(user);
        return "success";
    }

    // 修改
    @PostMapping("/update")
    public String update(@RequestBody User user) {
        userService.update(user);
        return "success";
    }

    // 删除
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "success";
    }
}