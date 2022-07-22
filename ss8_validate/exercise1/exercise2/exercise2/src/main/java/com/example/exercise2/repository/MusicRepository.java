package com.example.exercise2.repository;

import com.example.exercise2.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Integer> {

}
