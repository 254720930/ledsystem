package com.xcy.service;

import com.xcy.pojo.Admin;

import java.util.List;

public interface AdminService {

    String login(Admin admin);

    List<Admin> showAdmin(String username);

    int addAdmin(Admin admin);

    int deleteAdmin(int id);


    Admin getById(int id);

    int updateAdmin(Admin admin);
}
