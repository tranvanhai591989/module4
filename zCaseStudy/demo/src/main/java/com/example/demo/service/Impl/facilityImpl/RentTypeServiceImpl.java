package com.example.demo.service.Impl.facilityImpl;

import com.example.demo.model.facility.RentType;
import com.example.demo.repository.contract.RentTypeRepository;
import com.example.demo.service.facility.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
