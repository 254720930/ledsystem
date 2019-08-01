package com.xcy.mapper;

import com.xcy.pojo.OnlineMessageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OnlineMessageMapper {
    List<OnlineMessageVo> selectAllTest();
}
