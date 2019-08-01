package com.xcy.controller;

import com.xcy.pojo.Admin;
import com.xcy.pojo.LoginJson;
import com.xcy.service.AdminService;
import com.xcy.utils.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.HttpCookie;


@Controller
@RequestMapping("/admin")
public class AdminContorller {

    @Autowired
    AdminService adminService;

    @Autowired
    JedisClient jedisClient;

    @RequestMapping("/showLogin")
    public String showLogin(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("username".equals(c.getName())) {
                    return "behind/index";
                }
            }
        }
        return "behind/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public LoginJson login(String username, String password, Boolean rememberMe, HttpServletResponse response){

        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        String role = adminService.login(admin);
        System.out.println(role);
        if (role != null){
            LoginJson loginJsom = new LoginJson();
            loginJsom.setData("index");
            loginJsom.setCode(1);
            if (rememberMe){
                Cookie cookie = new Cookie("username",username);
                cookie.setMaxAge(60*60*24*7);
                cookie.setPath("/");
                response.addCookie(cookie);
                jedisClient.set(username,role);
            }
            return loginJsom;
        }else {
            LoginJson loginJsom = new LoginJson();
            loginJsom.setCode(10101);
            loginJsom.setData("账号或者密码错误");
            return loginJsom;
        }
    }

    @RequestMapping("/index")
    public String crud(){
        return "behind/index";
    }
}
