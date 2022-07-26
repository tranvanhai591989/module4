package com.example.demo.repository.employee;

import com.example.demo.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}
