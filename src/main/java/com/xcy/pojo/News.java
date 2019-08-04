package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class News {
    private int newsId;
    private int newsTypeId;
    private String newsTitle;
    private String newsContent;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date newsPublishTime;
    private String newsImageUrl;

    private News lastNews;
    private News nextNews;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(int newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Date getNewsPublishTime() {
        return newsPublishTime;
    }

    public void setNewsPublishTime(Date newsPublishTime) {
        this.newsPublishTime = newsPublishTime;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }

    public void setNewsImageUrl(String newsImageUrl) {
        this.newsImageUrl = newsImageUrl;
    }

    public News getLastNews() {
        return lastNews;
    }

    public void setLastNews(News lastNews) {
        this.lastNews = lastNews;
    }

    public News getNextNews() {
        return nextNews;
    }

    public void setNextNews(News nextNews) {
        this.nextNews = nextNews;
    }
}
