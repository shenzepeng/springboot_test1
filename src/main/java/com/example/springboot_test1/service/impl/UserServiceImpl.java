package com.example.springboot_test1.service.impl;

import com.example.springboot_test1.dao.UserDao;
import com.example.springboot_test1.pojo.User;
import com.example.springboot_test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/4 21:40
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
