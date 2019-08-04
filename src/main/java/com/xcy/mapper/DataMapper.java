package com.xcy.mapper;

import com.xcy.pojo.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<Data> getAllData();

    List<Data> getAllDataByLimit();
}
