package com.xcy.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("showGoods")
    public Goods show(Integer id){
        return goodsService.selectGoodsById(id);
    }

    @RequestMapping("showGoodsList")
    public Map<GoodsType,List<Goods>> showGoodsList(){
        return goodsService.selectGoodsList();
    }
}
