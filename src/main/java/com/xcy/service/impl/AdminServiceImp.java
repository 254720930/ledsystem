package com.xcy.service.impl;

import com.xcy.mapper.AdminMapper;
import com.xcy.pojo.Admin;
import com.xcy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public String login(Admin admin) {
        return adminMapper.login(admin);

    }
}
