package com.xcy.controller;

import com.github.pagehelper.PageInfo;
import com.xcy.pojo.Video;
import com.xcy.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    VideoService videoService;

    @RequestMapping("/getVideoByTypeId/{videoTypeId}")
    public PageInfo getVideoByTypeId(@PathVariable("videoTypeId")int id, @RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "12") Integer pageSize){
        List<Video> videoList = videoService.getVideoByTypeId(id,page,pageSize);
        return new PageInfo(videoList);
    }

    @RequestMapping("/sortVideoByPlayNum/{videoTypeId}")
    public PageInfo sortVideoByPlayNum(@PathVariable("videoTypeId")int id, @RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "12") Integer pageSize){
        List<Video> videoList = videoService.sortVideoByPlayNum(id,page,pageSize);
        return new PageInfo(videoList);
    }

    @RequestMapping("/getVideoById/{videoId}")
    public Video getVideoById(@PathVariable("videoId")int id){
        return videoService.getVideoById(id);
    }

    @RequestMapping("/getAllVideoByLimit")
    public List<Video> getAllVideoByLimit(){
        return videoService.getAllVideoByLimit();
    }
}
