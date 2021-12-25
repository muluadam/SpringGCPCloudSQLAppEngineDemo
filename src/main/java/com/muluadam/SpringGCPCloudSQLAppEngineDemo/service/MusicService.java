package com.muluadam.SpringGCPCloudSQLAppEngineDemo.service;

import com.muluadam.SpringGCPCloudSQLAppEngineDemo.domain.Music;

import java.util.List;
import java.util.Optional;

public interface MusicService {
      List<Music> findAll();
      Optional<Music> findById(Integer id);
      Music create(Music music);


}
