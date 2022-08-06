package com.example.demo.service.contract.contractImpl;

import com.example.demo.model.facility.AttachFacility;
import com.example.demo.repository.contract.AttachFacilityRepository;
import com.example.demo.service.contract.AttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityServiceImpl implements AttachFacilityService {
    @Autowired
    private AttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll(int id) {
        return attachFacilityRepository.findAllAttach(id);
    }

    @Override
    public List<AttachFacility> findAllAttach() {
        return attachFacilityRepository.findAll();
    }
}
