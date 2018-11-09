package com.ssm.test;

import com.ssm.model.Chapter;
import com.ssm.service.ChapterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class IChapterServiceTest {
    @Autowired
    private ChapterService chapterService;
    @Test
    public void getChapterByIdTest(){
        Chapter chapter=chapterService.getChapterById(99);
     //   System.out.println(chapter.getChapterLink());
    }
}
