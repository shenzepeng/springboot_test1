package com.example.springboot_test1.dao;

import com.example.springboot_test1.mapper.UserMapper;
import com.example.springboot_test1.pojo.User;
import com.example.springboot_test1.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/4 21:31
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser(){
        UserExample userExample=new UserExample();
        return userMapper.selectByExample(userExample);
    }

    public Integer addUser(User user){
        return userMapper.insert(user);
    }
}
