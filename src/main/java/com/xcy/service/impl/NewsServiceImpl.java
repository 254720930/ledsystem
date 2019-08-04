package com.xcy.service.impl;

import com.github.pagehelper.PageHelper;
import com.xcy.mapper.NewsMapper;
import com.xcy.pojo.News;
import com.xcy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<News> getNewsByTypeId(int id,Integer page,Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return newsMapper.getNewsByTypeId(id);
    }

    @Override
    public News getNewsById(int id) {
        News news = newsMapper.getNewsById(id);
        News lastNews = newsMapper.getLastNews(news.getNewsTypeId(),news.getNewsPublishTime(),news.getNewsId());
        News nextNews = newsMapper.getNextNews(news.getNewsTypeId(),news.getNewsPublishTime(),news.getNewsId());
        news.setLastNews(lastNews);
        news.setNextNews(nextNews);
        return news;
    }

    @Override
    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }
}
