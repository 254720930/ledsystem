package com.xcy.mapper;

import com.xcy.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    int login(Admin admin);
}
