package com.xcy.controller;

import com.xcy.pojo.OnlineMessageVo;
import com.xcy.service.OnlineMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/olmessage")
public class OnlineMessageController {

    @Autowired
    OnlineMessageService onlineMessageService;

    @RequestMapping("/Test")
    public List<OnlineMessageVo> Test() {
        System.out.println("这个方法是测试以下连接成功了没");
        List<OnlineMessageVo> onlineMessageVoList = onlineMessageService.selectAllTest();
        return onlineMessageVoList;
    }

}
