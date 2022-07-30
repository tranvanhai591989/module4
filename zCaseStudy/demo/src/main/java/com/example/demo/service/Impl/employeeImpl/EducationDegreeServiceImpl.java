package com.example.demo.service.Impl.employeeImpl;

import com.example.demo.model.employee.EducationDegree;
import com.example.demo.repository.employee.EducationDegreeRepository;
import com.example.demo.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
