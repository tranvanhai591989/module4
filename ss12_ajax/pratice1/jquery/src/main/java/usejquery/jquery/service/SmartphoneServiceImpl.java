package usejquery.jquery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usejquery.jquery.model.Smartphone;
import usejquery.jquery.repository.SmartphoneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements SmartPhoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
