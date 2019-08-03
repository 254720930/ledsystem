package com.xcy.service;

import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;

import java.util.List;
import java.util.Map;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */

public interface GoodsService {

    Goods selectGoodsById(int id);

    Map<GoodsType,List<Goods>> selectGoodsList();
}
