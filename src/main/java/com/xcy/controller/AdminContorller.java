package com.xcy.controller;

import com.xcy.pojo.Admin;
import com.xcy.pojo.LoginJson;
import com.xcy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminContorller {

    @Autowired
    AdminService adminService;


    @RequestMapping("/showLogin")
    public String showLogin(){
        return "behind/login";
    }

    @RequestMapping("/login")
    public LoginJson login(String name,String password){
        Admin admin = new Admin();
        admin.setAdminName(name);
        admin.setPassword(password);
        int result = adminService.login(admin);
        if (result == 1){
            LoginJson loginJsom = new LoginJson();
            loginJsom.setData("behind/index");
            loginJsom.setCode(1);
            return loginJsom;
        }else {
            LoginJson loginJsom = new LoginJson();
            loginJsom.setCode(10101);
            return loginJsom;
        }
    }

    @RequestMapping("/crud")
    public String crud(){
        return "behind/crud";
    }
}
