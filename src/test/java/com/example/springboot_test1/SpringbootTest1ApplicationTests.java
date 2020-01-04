package com.example.springboot_test1;

import com.example.springboot_test1.dao.UserDao;
import com.example.springboot_test1.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringbootTest1ApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
//        List<User> allUser = userDao.findAllUser();
//        System.out.println(allUser);
        User user=new User();
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setImgUrl("asdas");
        user.setNickName("asdfijos");
        Integer result = userDao.addUser(user);
        System.out.println(result);
    }



}
