package com.xcy.service.impl;

import com.xcy.mapper.GoodsMapper;
import com.xcy.pojo.Goods;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Goods selectGoosListById(int id) {
        return goodsMapper.selectGoosListById(id);
    }
}
