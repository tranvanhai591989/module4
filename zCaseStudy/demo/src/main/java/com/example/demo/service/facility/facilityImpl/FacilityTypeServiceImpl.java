package com.example.demo.service.facility.facilityImpl;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.repository.facility.FacilityTypeRepository;
import com.example.demo.service.facility.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {
    @Autowired
    private FacilityTypeRepository facilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
