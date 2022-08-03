package com.example.demo.service.employee.employeeImpl;

import com.example.demo.model.employee.Division;
import com.example.demo.repository.employee.DivisionRepository;
import com.example.demo.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
