package com.example.demo.service.facility;

import com.example.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FacilityService {
    Page<Facility> findAll(Pageable pageable);

    void save(Facility facility);

    void updateEmployee(Facility facility);

    void deleteFacilityByFacilityId(int id);

    Optional<Facility> findById(int id);

    Page<Facility> searchByName(String name, Pageable pageable);

}
