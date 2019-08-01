package com.xcy.service.serviceImp;

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
    public int login(Admin admin) {
        int result = adminMapper.login(admin);
        return result>0? 1:0;
    }
}
