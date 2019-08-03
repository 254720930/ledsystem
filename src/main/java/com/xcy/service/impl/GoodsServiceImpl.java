package com.xcy.service.impl;

import com.xcy.mapper.GoodsMapper;
import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Goods selectGoodsById(int id) {
        Goods goods = goodsMapper.selectGoodsById(id);
        goods.setGoodsImg(Arrays.asList(goods.getGoodsImgUrl().split(";")));
        return goods;
    }

    @Override
    public Map<GoodsType,List<Goods>> selectGoodsList() {
        List<GoodsType> goodsTypeList = goodsMapper.selectGoodsType();
        Map<GoodsType,List<Goods>> map = new HashMap<>();
        for (GoodsType g: goodsTypeList) {
            List<Goods> goodsList = goodsMapper.selectGoodsList(g.getId());
            if(null != goodsList && goodsList.size() > 0) {
                map.put(g,goodsList);
            }
        }
        return map;
    }
}
