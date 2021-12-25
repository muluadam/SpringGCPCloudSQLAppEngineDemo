package com.muluadam.SpringGCPCloudSQLAppEngineDemo.repository;

import com.muluadam.SpringGCPCloudSQLAppEngineDemo.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
}
