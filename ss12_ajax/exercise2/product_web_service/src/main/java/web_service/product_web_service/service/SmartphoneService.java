package web_service.product_web_service.service;

import web_service.product_web_service.model.Smartphone;

import java.util.Optional;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
