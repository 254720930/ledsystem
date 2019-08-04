package com.xcy.controller;

import com.github.pagehelper.PageInfo;
import com.xcy.pojo.News;
import com.xcy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping("/getNewsByTypeId/{newsTypeId}")
    public PageInfo getNewsByTypeId(@PathVariable("newsTypeId")int id, @RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize){
        List<News> newsList = newsService.getNewsByTypeId(id,page,pageSize);
        PageInfo pageInfo = new PageInfo(newsList);
        return pageInfo;
    }

    @RequestMapping("/getNewsById/{newsId}")
    public News getNewsById(@PathVariable("newsId")int id){
        return newsService.getNewsById(id);
    }


    @RequestMapping("/getAllNews")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

}
