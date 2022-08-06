package com.example.demo.service.contract;

import com.example.demo.model.facility.AttachFacility;

import java.util.List;

public interface AttachFacilityService {
    List<AttachFacility> findAll(int id);

    List<AttachFacility> findAllAttach();
}
