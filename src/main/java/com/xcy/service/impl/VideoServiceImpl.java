package com.xcy.service.impl;

import com.github.pagehelper.PageHelper;
import com.xcy.mapper.VideoMapper;
import com.xcy.pojo.Video;
import com.xcy.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;

    @Override
    public List<Video> getVideoByTypeId(int id, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return videoMapper.getVideoByTypeId(id);
    }

    @Override
    public List<Video> sortVideoByPlayNum(int id, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return videoMapper.sortVideoByPlayNum(id);
    }

    @Override
    public Video getVideoById(int id) {
        Video video = videoMapper.getVideoById(id);
        Video lastVideo = videoMapper.getLastVideo(video.getVideoTypeId(),video.getVideoPublishTime(),video.getVideoId());
        if (lastVideo != null){
            System.out.println("lastVideo"+lastVideo.getVideoTitle());
        }

        Video nextVideo = videoMapper.getNextVideo(video.getVideoTypeId(),video.getVideoPublishTime(),video.getVideoId());
        if(nextVideo != null){
            System.out.println("nextVideo"+nextVideo.getVideoTitle());
        }
        video.setLastVideo(lastVideo);
        video.setNextVideo(nextVideo);
        List<Video> relaVideo = videoMapper.getAllRelaVideo(video.getVideoTypeId(),video.getVideoTv());
        video.setRelaVideo(relaVideo);
        return video;
    }

    @Override
    public List<Video> getAllVideoByLimit() {
        return videoMapper.getAllVideoByLimit();
    }
}
