package com.xcy.mapper;

import com.xcy.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
     List<Admin> showAdmin(Admin admin);

    List<Admin> showAdminAll();

    String login(Admin admin);
}
