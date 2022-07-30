package usejquery.jquery.service;

import usejquery.jquery.model.Smartphone;

import java.util.List;
import java.util.Optional;

public interface SmartPhoneService {
    List<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}