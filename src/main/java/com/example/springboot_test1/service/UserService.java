package com.example.springboot_test1.service;

import com.example.springboot_test1.pojo.User;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/4 21:40
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    Integer addUser(User user);
    List<User> findAllUser();
}
