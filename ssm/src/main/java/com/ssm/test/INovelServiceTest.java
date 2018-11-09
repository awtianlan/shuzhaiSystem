package com.ssm.test;

import com.ssm.model.Novel;
import com.ssm.service.NovelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class INovelServiceTest {
    @Autowired
    private NovelService novelService;
    @Test
    public void getNovelByIdTest(){
        List<Novel> novel=novelService.getAll();
        System.out.println(novel);
    }
}
