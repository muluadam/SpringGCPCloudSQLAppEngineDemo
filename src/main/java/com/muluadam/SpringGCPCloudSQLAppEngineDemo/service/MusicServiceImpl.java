package com.muluadam.SpringGCPCloudSQLAppEngineDemo.service;

import com.muluadam.SpringGCPCloudSQLAppEngineDemo.domain.Music;
import com.muluadam.SpringGCPCloudSQLAppEngineDemo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService{

    @Autowired
    MusicRepository musicRepository;
    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public  Optional findById(Integer id) {
        return musicRepository.findById(id);
    }

    @Override
    public Music create(Music music) {
        return musicRepository.save(music);
    }
}
