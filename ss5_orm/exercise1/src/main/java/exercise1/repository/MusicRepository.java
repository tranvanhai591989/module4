package exercise1.repository;

import exercise1.model.Music;

import java.util.List;

public interface MusicRepository {
    List<Music> findAll();

    void save(Music music);

    void remove(int id);

    void update(int id, Music music);

    Music findById(int id);

}
