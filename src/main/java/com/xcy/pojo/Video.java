package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Video {
    private int videoId;
    private int videoTypeId;
    private String videoTv;
    private String videoTitle;
    private String videoContent;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date videoPublishTime;
    private String videoImageUrl;
    private String videoUrl;
    private int videoPlayNum;

    private Video lastVideo;
    private Video nextVideo;

    private List<Video> relaVideo;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(int videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public String getVideoTv() {
        return videoTv;
    }

    public void setVideoTv(String videoTv) {
        this.videoTv = videoTv;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent;
    }

    public Date getVideoPublishTime() {
        return videoPublishTime;
    }

    public void setVideoPublishTime(Date videoPublishTime) {
        this.videoPublishTime = videoPublishTime;
    }

    public String getVideoImageUrl() {
        return videoImageUrl;
    }

    public void setVideoImageUrl(String videoImageUrl) {
        this.videoImageUrl = videoImageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getVideoPlayNum() {
        return videoPlayNum;
    }

    public void setVideoPlayNum(int videoPlayNum) {
        this.videoPlayNum = videoPlayNum;
    }

    public Video getLastVideo() {
        return lastVideo;
    }

    public void setLastVideo(Video lastVideo) {
        this.lastVideo = lastVideo;
    }

    public Video getNextVideo() {
        return nextVideo;
    }

    public void setNextVideo(Video nextVideo) {
        this.nextVideo = nextVideo;
    }

    public List<Video> getRelaVideo() {
        return relaVideo;
    }

    public void setRelaVideo(List<Video> relaVideo) {
        this.relaVideo = relaVideo;
    }

}
