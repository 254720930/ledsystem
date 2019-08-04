package com.xcy.mapper;

import com.xcy.pojo.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface VideoMapper {
    List<Video> getVideoByTypeId(int id);

    List<Video> sortVideoByPlayNum(int id);

    Video getVideoById(int id);

    Video getLastVideo(int videoTypeId, Date videoPublishTime, int videoId);

    Video getNextVideo(int videoTypeId, Date videoPublishTime, int videoId);

    List<Video> getAllRelaVideo(int videoTypeId, String videoTv);

    List<Video> getAllVideoByLimit();
}
