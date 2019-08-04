package com.xcy.controller;

import com.github.pagehelper.PageInfo;
import com.xcy.pojo.Data;
import com.xcy.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class dataController {
    @Autowired
    DataService dataService;

    @RequestMapping("/getAllData")
    public PageInfo getAllData(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "20") Integer pageSize){
        List<Data> dataList = dataService.getAllData(page,pageSize);
        PageInfo pageInfo = new PageInfo(dataList);
        return pageInfo;
    }

    @RequestMapping("/getAllDataByLimit")
    public List<Data> getAllDataByLimit(){
        return dataService.getAllDataByLimit();
    }
}
