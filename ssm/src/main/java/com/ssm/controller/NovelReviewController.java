package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.ssm.model.Chapter;
import com.ssm.model.NovelReview;
import com.ssm.model.Up;
import com.ssm.service.NovelReviewService;
import com.ssm.service.UpService;
import com.ssm.util.IpUtil;
import com.ssm.util.PropertiesUtil;
import com.ssm.util.UdpGetClientMacAddr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping(value="NR",produces = "text/html;charset=UTF-8")
public class NovelReviewController {
    @Resource
    private UpService upService;
    @Resource
    private NovelReviewService novelReviewService;
    @RequestMapping("getpage")
    @ResponseBody
    public String getPage(int nid,int page){
        PageHelper.startPage(page,10);
        List<NovelReview> novelReviews=novelReviewService.getReview(BigDecimal.valueOf(nid));
        PageInfo pageinfo=new PageInfo(novelReviews,5);
        Gson gson=new Gson();

        String json=gson.toJson(pageinfo);
        return json;

    }
    @RequestMapping("up")
    @ResponseBody
    public String  up(int nrid,HttpServletRequest request){
        String mac="";

        System.out.println("------"+nrid);
        Up con=new Up();
        NovelReview novelReview =novelReviewService.getById(BigDecimal.valueOf(nrid));
        try {
           // UdpGetClientMacAddr umac=new UdpGetClientMacAddr(getIp(request));
            mac=IpUtil.getIp(request);
            System.out.println("------2------"+mac);
        } catch (Exception e) {
            e.printStackTrace();
        }
        con.setMac(mac);
        con.setNrid(BigDecimal.valueOf(nrid));
         Up up=upService.getUpByMacAndUp(con);
        if(up==null){

            novelReview.setLikeNum(novelReview.getLikeNum().add(BigDecimal.valueOf(1)));
            novelReviewService.updateById(novelReview);
            Up u=new Up();
            u.setMac(mac);
            u.setNrid(BigDecimal.valueOf(nrid));
            upService.add(u);
        }
        return novelReview.getLikeNum().toString();
    }
    @RequestMapping("getNRRById")
    public String getNRRById(int id, Model model){
        NovelReview novelReview=novelReviewService.getById(BigDecimal.valueOf(id));
        model.addAttribute("nrr",novelReview);
        model.addAttribute("img",PropertiesUtil.getProperties("headpath"));

        return "/comment";
    }

    

}
