package com.example.springbootdemo.controller;

/**
 * @Author：Chaojun_Lu
 * @Date：2024/7/15 23:58
 * @Function：
 */

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    // 查询数据库中所有信息
    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        System.out.println("getAll return");
        return userService.getAll();
    }

    //根据ID查询其中一条数据
    @GetMapping("/getUserById")
    @ResponseBody
    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    // 根据ID删除数据库中信息
    @GetMapping("/deleteById")
    @ResponseBody
    public boolean deleteById(int id){
        return userService.deleteById(id);
    }

    // 增加一条数据
    @GetMapping("/insert")
    @ResponseBody
    public boolean insert(User user){
        return userService.insert(user);
    }

    //改变数据库中一条数据
    @GetMapping("/updateById")
    @ResponseBody
    public boolean updateById(int id){
        return userService.updateById(id);
    }
}
