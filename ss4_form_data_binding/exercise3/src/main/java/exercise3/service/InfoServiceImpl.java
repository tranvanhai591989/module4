package exercise3.service;

import exercise3.model.Info;
import exercise3.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoRepository infoRepository;

    @Override
    public List<Info> getAll() {
        return infoRepository.getAll();
    }

    @Override
    public void create(Info info) {
        infoRepository.create(info);
    }

    @Override
    public void update(String id, Info info) {
        infoRepository.update(id, info);
    }

    @Override
    public String[] getBirthYear() {
        return infoRepository.getBirthYear();
    }

    @Override
    public String[] getGender() {
        return infoRepository.getGender();
    }

    @Override
    public String[] getNational() {
        return infoRepository.getNational();
    }

    @Override
    public String[] getTransportType() {
        return infoRepository.getTransportType();
    }

    @Override
    public String[] getInputDay() {
        return infoRepository.getInputDay();
    }

    @Override
    public String[] getInputMonth() {
        return infoRepository.getInputMonth();
    }

    @Override
    public String[] getInputYear() {
        return infoRepository.getInputYear();
    }

    @Override
    public String[] getOutDay() {
        return infoRepository.getOutDay();
    }

    @Override
    public String[] getOutMonth() {
        return infoRepository.getOutMonth();
    }

    @Override
    public String[] getOutYear() {
        return infoRepository.getOutYear();
    }
}
