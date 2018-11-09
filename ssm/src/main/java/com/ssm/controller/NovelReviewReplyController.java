package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.ssm.model.NovelReview;
import com.ssm.model.NovelReviewReply;
import com.ssm.model.Up;
import com.ssm.service.NovelReviewReplyService;
import com.ssm.service.NovelReviewService;
import com.ssm.service.UpService;
import com.ssm.util.IpUtil;
import com.ssm.util.PropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping(value="NRR",produces = "text/html;charset=UTF-8")
public class NovelReviewReplyController {
    @Resource
    private UpService upService;

    private NovelReviewService novelReviewService;
    @Resource
    private NovelReviewReplyService novelReviewReplyService;
    @RequestMapping("getpage")
    @ResponseBody
    public String getPage(int nrid,int page){
        PageHelper.startPage(page,10);
        List<NovelReviewReply> novelReviewReplys=novelReviewReplyService.getNRRByNrid(BigDecimal.valueOf(nrid));
        PageInfo pageinfo=new PageInfo(novelReviewReplys,5);
        Gson gson=new Gson();

        String json=gson.toJson(pageinfo);
        return json;

    }
    @RequestMapping("up")
    @ResponseBody
    public String  up(int nrid,HttpServletRequest request){
        String mac="";

        System.out.println("------"+nrid);
        Up up=new Up();
        NovelReviewReply novelReviewReply =novelReviewReplyService.getNRRByid(BigDecimal.valueOf(nrid));
        try {
           // UdpGetClientMacAddr umac=new UdpGetClientMacAddr(getIp(request));
            mac= IpUtil.getIp(request);
            System.out.println("------2------"+mac);
        } catch (Exception e) {
            e.printStackTrace();
        }
         up=upService.getUpBy(mac, BigDecimal.valueOf(nrid));
        if(up==null){

            novelReviewReply.setLikeNum(novelReviewReply.getLikeNum().add(BigDecimal.valueOf(1)));
            novelReviewReplyService.updateById(novelReviewReply);
            Up u=new Up();
            u.setMac(mac);
            u.setNrid(BigDecimal.valueOf(nrid));
            upService.add(u);
        }
        return novelReviewReply.getLikeNum().toString();
    }


}
