package com.xcy.service.impl;

import com.github.pagehelper.PageHelper;
import com.xcy.mapper.DataMapper;
import com.xcy.pojo.Data;
import com.xcy.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    DataMapper dataMapper;

    @Override
    public List<Data> getAllData(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return dataMapper.getAllData();
    }

    @Override
    public List<Data> getAllDataByLimit() {
        return dataMapper.getAllDataByLimit();
    }
}
