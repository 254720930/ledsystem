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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
       /* if (cookies != null) {
            for (Cookie c : cookies) {
                if ("username".equals(c.getName())) {
                    return "behind/index";
                }
            }
        }*/
        return "behind/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public LoginJson login(String username, String password, Boolean rememberMe, HttpServletResponse response){

        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        String role = adminService.login(admin);
        if (role != null){
            LoginJson loginJsom = new LoginJson();
            loginJsom.setData("index");
            loginJsom.setCode(1);

                Cookie cookie = new Cookie("username",username);
                cookie.setMaxAge(60*10);
                cookie.setPath("/");
                response.addCookie(cookie);
                jedisClient.set(username,role);
            return loginJsom;
        }else {
            LoginJson loginJsom = new LoginJson();
            loginJsom.setCode(10101);
            loginJsom.setData("账号或者密码错误");
            return loginJsom;
        }
    }
    //展示后台欢迎页面
    @RequestMapping("/index")
    public String crud(){
        return "behind/index";
    }


    //后台展示管理员信息
    @RequestMapping("/adminList")
    @ResponseBody
    public List<Admin> adminList(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String cookieName = "username";
        String username = null;
        for (Cookie cookie : cookies){
            if(cookie.getName().equals(cookieName)){
                username = cookie.getValue();
            }
        }
        List<Admin> adminList = adminService.showAdmin(username);
        return adminList;
    }

    //展示后台管理员信息页面
    @RequestMapping("/showAdmin")
    public String showAdmin(){
        return "behind/showAdmin";
    }

    //退出后台管理系统
    @RequestMapping("/exit")
    public String exit(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String cookieName = "username";
        String username = null;
        for (Cookie cookie : cookies){
            if(cookie.getName().equals(cookieName)){
                username = cookie.getValue();
            }
        }
        Boolean isExist = jedisClient.exists(username);
        if (isExist){
            jedisClient.del(username);
        }
        return "behind/login";
    }

    //添加后台管理员
    @RequestMapping("/addAdmin")
    public int addAdmin(Admin admin){
        int result = adminService.addAdmin(admin);
        return result;
    }
    //添加后台管理员
    @RequestMapping("/deleteAdmin")
    public int deleteAdmin(int id){
        int result = adminService.deleteAdmin(id);
        return result;
    }
    //编辑后台管理员信息展示信息
    @RequestMapping("/getById")
    public Admin getById(int id){
        Admin admin = adminService.getById(id);
        return admin;
    }//编辑后台管理员信息展示信息
    @RequestMapping("/updateAdmin")
    public int updateAdmin(Admin admin){
        int result = adminService.updateAdmin(admin);
        return result;
    }
}



