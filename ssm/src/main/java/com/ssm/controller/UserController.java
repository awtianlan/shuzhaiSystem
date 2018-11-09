package com.ssm.controller;

import com.google.gson.Gson;
import com.ssm.model.User;
import com.ssm.service.UserService;
import com.ssm.util.MD5Util;
import com.ssm.util.MailUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("add")
    public String  insertUser(User user, Model model){
    String code=UUID.randomUUID().toString().replace("-", "").toUpperCase();
    user.setCode(code);
    user.setPassword(MD5Util.md5(user.getPassword()));
    userService.addUser(user);
    user=userService.getUserByName(user.getUsername());
        String emailMsg="欢迎您注册成为我们的会员,<a href='http://localhost:8080/ssm/user/activate?userid="+user.getId()+"&code="+user.getCode()+"'>点击链接激活</a>";
        MailUtil mail=new MailUtil();
        mail.send(user.getEmail(),"账号激活",emailMsg);
        model.addAttribute("msg","请激活账号后登陆");
        return "/login";
    }
    @RequestMapping("activate")
    public String activate(HttpServletRequest request,Model model){
        int id=Integer.parseInt(request.getParameter("userid"));
        String code=request.getParameter("code");
        User user=userService.getUserById(id);
        if(user.getCode().equals(code)){
            user.setCode(null);
            user.setStatus(1);
            userService.updateUser(user);
            model.addAttribute("msg","激活成功！");
        }
        else{
            model.addAttribute("msg","无效链接！");
        }
        return "/activate";
    }
    @RequestMapping("login")
    public String login(User user, HttpServletRequest req, HttpServletResponse response, Model model){
     User u=userService.getUserByName(user.getUsername());
    if(u!=null){
        if(u.getPassword().equals(MD5Util.md5(user.getPassword()))){
           if(u.getStatus()>0){
               HttpSession session=req.getSession();
               session.setAttribute("username",user.getUsername());
               session.setAttribute("uid",u.getId());
               Cookie cookie = new Cookie("username", u.getUsername());    // (name,value);
               //注意：由于cookie的value值只能装字符串，所以我们将购物车对象（buycart）转化为json，再将json写入cookie的value值
               //关闭浏览器也要有Cookie，那就给它个生存时间就可以了
               cookie.setMaxAge(3600 * 24);
               //设置cookie路径
               cookie.setPath("/upload/");
               //写入肯定是要用response
               response.addCookie(cookie);

               System.out.println("session----"+session.getId());
               return "redirect:../index/show";
           }else{
               model.addAttribute("msg","账号未激活！");
               return "/login";
           }
        }
        else{
            model.addAttribute("msg","密码错误！");
            return "/login";
        }
    }else{
        model.addAttribute("msg","账号错误！");
        return "/login";
    }
    }

    @RequestMapping("getUserInfo")
    @ResponseBody
    public String getUserInfo(HttpServletRequest request,HttpServletResponse response,@RequestParam("callback") String callback){
      // HttpSession session=request.;
//        String origin = request.getHeader("Origin");
//        System.out.println(origin);
//        if(origin == null) {
//            origin ="http://localhost:8080/upload";
//
//        }
//        System.out.println(origin);
//        response.setHeader("Access-Control-Allow-Origin", origin);            // 允许指定域访问跨域资源
//        response.setHeader("Access-Control-Allow-Credentials", "true");       // 允许客户端携带跨域cookie，此时origin值不能为“*”，只能为指定单一域名
        String username=request.getParameter("user");
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null && cookies.length > 0) {
//            for (Cookie c : cookies) {
//                System.out.println(c.getName()+"="+c.getValue());
//                if ("username".equals(c.getName())) {
//                    //拿到cookie名为Constants.BUYCART_COOKIE中的value
//                    username = c.getValue();
//                    break;
//                }
//            }
//        }

        Gson gson=new Gson();
        Map<Object,Object> map=new HashMap<>();


        System.out.println("username"+username);

        if(username!=null&&username!=""){
            User user=userService.getUserByName(username);
            map.put("user","1");
            map.put("username",user.getUsername());
            map.put("role",user.getRole());
            return callback+"("+gson.toJson(map)+")";
        }else{
            map.put("user","0");
            return callback+"("+gson.toJson(map)+")";
        }

    }
        @RequestMapping("getUserInfob")
        @ResponseBody
    public String getUserInfob(HttpServletRequest req){
       String username= (String) req.getSession().getAttribute("username");
            System.out.println(username);
            System.out.println("--------------"+req.getSession().getId());
       User user=userService.getUserByName(username);
        return new Gson().toJson(user);

    }
}
