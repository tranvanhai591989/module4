package com.example.exercise2.service;

import com.example.exercise2.model.Music;
import com.example.exercise2.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicRepository musicRepository;


    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public Optional<Music> findById(int id) {
        return musicRepository.findById(id);
    }
}
