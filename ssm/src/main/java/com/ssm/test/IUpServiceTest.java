package com.ssm.test;

import com.ssm.model.Up;
import com.ssm.model.User;
import com.ssm.service.UpService;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class IUpServiceTest {

    @Autowired
    public UpService userService;

    @Test
    public void getUserByIdTest(){
            Up up=new Up();
            up.setMac("127.0.0.1");
            up.setNrid(BigDecimal.valueOf(1));
        Up user = userService.getUpByMacAndUp(up);

    }

}