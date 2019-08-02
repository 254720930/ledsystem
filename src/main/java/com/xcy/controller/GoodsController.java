package com.xcy.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xcy.pojo.Goods;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */
@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("show")
    public String show(Model model){
        List<Goods> goodsList = goodsService.selectGoosList();
        model.addAttribute(goodsList);
        return "behind/goods";
    }
}
