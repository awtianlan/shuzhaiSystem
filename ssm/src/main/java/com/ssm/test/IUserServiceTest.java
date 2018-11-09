package com.ssm.test;

import com.google.gson.Gson;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class IUserServiceTest {

    @Autowired
    public UserService userService;

    @Test
    public void getUserByIdTest(){

        User user = userService.getUserById(62);
        System.out.println(new Gson().toJson(user));
    }

}