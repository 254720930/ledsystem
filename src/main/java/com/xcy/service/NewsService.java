package com.xcy.service;

import com.xcy.pojo.News;

import java.util.List;

public interface NewsService {
    List<News> getNewsByTypeId(int id, Integer page, Integer pageSize);

    News getNewsById(int id);

    List<News> getAllNews();
}
