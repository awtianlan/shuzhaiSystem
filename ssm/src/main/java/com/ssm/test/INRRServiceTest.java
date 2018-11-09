package com.ssm.test;

import com.ssm.model.Chapter;
import com.ssm.model.NovelReviewReply;
import com.ssm.service.ChapterService;
import com.ssm.service.NovelReviewReplyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class INRRServiceTest {
    @Autowired
    private NovelReviewReplyService novelReviewReplyService;
    @Test
    public void getNRRByidTest(){
       // List<NovelReviewReply> novelReviewReply=novelReviewReplyService.getNRRByNrid(BigDecimal.valueOf(1));
//       NovelReviewReply novelReviewReply=novelReviewReplyService.getNRRByid(BigDecimal.valueOf(1));
//        System.out.println(novelReviewReply.getContent());
   List<NovelReviewReply> novelReviewReplies=novelReviewReplyService.getNRRByRpID(BigDecimal.valueOf(1));
    }
}
