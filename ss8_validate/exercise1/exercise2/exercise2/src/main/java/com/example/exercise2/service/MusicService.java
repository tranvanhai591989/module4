package com.example.exercise2.service;

import com.example.exercise2.model.Music;

import java.util.List;
import java.util.Optional;

public interface MusicService {
    List<Music> findAll();

    void save(Music music);

    void remove(int id);

    Optional<Music> findById(int id);

}
