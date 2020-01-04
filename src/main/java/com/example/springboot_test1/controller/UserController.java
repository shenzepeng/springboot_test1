package com.example.springboot_test1.controller;

import com.example.springboot_test1.pojo.User;
import com.example.springboot_test1.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/4 21:40
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("find/all/user")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    /**
     * 通过form表单提交
     * @param user
     * @return
     */
    @PostMapping
    public Integer addUser(User user){
        return userService.addUser(user);
    }

    /**
     * 通过json提交
     * @param user
     * @return
     */
    @PostMapping("add/user/by/json")
    public Integer addUserByJson(@RequestBody User user){
        return userService.addUser(user);
    }
}
