package com.xcy.service.impl;

import com.xcy.mapper.OnlineMessageMapper;
import com.xcy.pojo.OnlineMessageVo;
import com.xcy.service.OnlineMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineMessageServiceImpl implements OnlineMessageService {

    @Autowired
    OnlineMessageMapper onlineMessageMapper;

    @Override
    public List<OnlineMessageVo> selectAllTest() {
        List<OnlineMessageVo> onlineMessageVoList = onlineMessageMapper.selectAllTest();
        return onlineMessageVoList;
    }
}
