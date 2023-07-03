package com.wildflix.wildflix.services;

import com.wildflix.wildflix.models.Video;

import java.util.List;

public interface VideoService {

    Video createVideo(Video video);
    List<Video> getAllVideos();
    Video getVideoById(Long id);

}
