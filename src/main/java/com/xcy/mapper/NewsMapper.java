package com.xcy.mapper;

import com.xcy.pojo.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface NewsMapper {
    List<News> getNewsByTypeId(int id);

    News getNewsById(int id);

    News getLastNews(int newsTypeId, Date newsPublishTime, int newsId);

    News getNextNews(int newsTypeId, Date newsPublishTime, int newsId);

    List<News> getAllNews();
}
