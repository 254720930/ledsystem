package com.xcy.mapper;

import com.xcy.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */
@Mapper
public interface GoodsMapper {
    List<Goods> selectGoosList();

}
