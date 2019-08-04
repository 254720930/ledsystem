package com.xcy.service;

import com.xcy.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> getVideoByTypeId(int id, Integer page, Integer pageSize);

    List<Video> sortVideoByPlayNum(int id, Integer page, Integer pageSize);

    Video getVideoById(int id);

    List<Video> getAllVideoByLimit();
}
