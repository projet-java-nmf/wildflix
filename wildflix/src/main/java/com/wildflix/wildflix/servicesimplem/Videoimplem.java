package com.wildflix.wildflix.servicesimplem;

import com.wildflix.wildflix.models.Video;
import com.wildflix.wildflix.repositeries.VideoRepository;
import com.wildflix.wildflix.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Videoimplem implements VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public Video createVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Video getVideoById(Long id) {
        Optional<Video> video = videoRepository.findById(id);
        if (video.isPresent()){
            return video.get();
        }
        return null;
    }
}
