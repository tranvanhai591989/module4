package com.example.demo.service.facility.facilityImpl;

import com.example.demo.model.facility.Facility;
import com.example.demo.repository.facility.FacilityRepository;
import com.example.demo.service.facility.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public List<Facility> findAllFacility() {
        return facilityRepository.findAll();
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void updateFacility(Facility facility) {
        int i = facility.getFacilityType().getFacilityTypeId();
        if (i == 2) {
            facility.setFacilityPoolArea(null);
        }
        if (i == 3) {
            facility.setFacilityPoolArea(null);
            facility.setFacilityNumberOfFloors(null);
        }
        facilityRepository.save(facility);
    }

    @Override
    public void deleteFacilityByFacilityId(int id) {
        facilityRepository.deleteById(id);
    }

    @Override
    public Optional<Facility> findById(int id) {
        return facilityRepository.findById(id);
    }

    @Override
    public Page<Facility> searchByName(String name, Pageable pageable) {
        return facilityRepository.searchByName("%" + name + "%", pageable);
    }
}
