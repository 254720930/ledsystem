package com.xcy.service.impl;

import com.xcy.mapper.AdminMapper;
import com.xcy.pojo.Admin;
import com.xcy.service.AdminService;
import com.xcy.utils.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private JedisClient jedisClient;
    @Override
    public String login(Admin admin) {
        return adminMapper.login(admin);

    }

    @Override
    public List<Admin> showAdmin(String username) {
        Boolean isExists = jedisClient.exists(username);
        System.out.println(isExists);
        List<Admin> adminList = null;
        if (isExists) {
            //判断用户权限
            if (jedisClient.get(username).equals("1")) {
                adminList = adminMapper.showAdminAll();
            } else {
                Admin admin = new Admin();
                admin.setUsername(username);
                adminList = adminMapper.showAdmin(admin);
            }
        }else {
            Admin admin = new Admin();
            admin.setUsername(username);
            adminList = adminMapper.showAdmin(admin);
        }
        return adminList;
    }

    @Override
    public int addAdmin(Admin admin) {
        int result = adminMapper.addAdmin(admin);
        return result>0? 1:0;
    }

    @Override
    public int deleteAdmin(int id) {
        int result = adminMapper.deleteAdmin(id);
        return result>0? 1:0;
    }

    @Override
    public int updateAdmin(Admin admin) {
        int result = adminMapper.addAdmin(admin);
        return result>0? 1:0;
    }

    @Override
    public Admin getById(int id) {
        Admin admin = adminMapper.getById(id);
        return admin;
    }
}
