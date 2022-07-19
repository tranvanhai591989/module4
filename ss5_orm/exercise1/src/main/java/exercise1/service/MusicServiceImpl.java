package exercise1.service;

import exercise1.model.Music;
import exercise1.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        musicRepository.remove(id);
    }

    @Override
    public void update(int id, Music music) {
        musicRepository.update(id, music);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }
}
