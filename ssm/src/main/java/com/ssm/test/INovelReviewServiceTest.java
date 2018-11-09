package com.ssm.test;

import com.ssm.model.NovelReview;
import com.ssm.model.User;
import com.ssm.service.NovelReviewService;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class INovelReviewServiceTest {

    @Autowired
    public NovelReviewService userService;

    @Test
    public void getUserByIdTest(){

        List<NovelReview> nrs= userService.getReview((BigDecimal.valueOf(109)));
        System.out.println(nrs.get(0).getCreateTime());
    }

}