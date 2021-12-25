package com.muluadam.SpringGCPCloudSQLAppEngineDemo.controller;

import com.muluadam.SpringGCPCloudSQLAppEngineDemo.domain.Music;
import com.muluadam.SpringGCPCloudSQLAppEngineDemo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    @GetMapping("/all")
    public List<Music> getAllnew(){
        return  musicService.findAll();
    }


    @GetMapping
    public List<Music> getAll(){
        return  musicService.findAll();
    }

    @PostMapping
    public Music create(@RequestBody Music music){
        return  musicService.create(music);
    }


}
