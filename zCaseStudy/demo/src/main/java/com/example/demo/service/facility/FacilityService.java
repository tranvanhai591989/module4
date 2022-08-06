package com.example.demo.service.facility;

import com.example.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FacilityService {
    Page<Facility> findAll(Pageable pageable);

    List<Facility> findAllFacility();

    void save(Facility facility);

    void updateFacility(Facility facility);

    void deleteFacilityByFacilityId(int id);

    Optional<Facility> findById(int id);

    Page<Facility> searchByName(String name, Pageable pageable);

}
