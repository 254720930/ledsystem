package com.xcy.service;

import com.xcy.pojo.Data;

import java.util.List;

public interface DataService {
    List<Data> getAllData(Integer page, Integer pageSize);

    List<Data> getAllDataByLimit();
}
