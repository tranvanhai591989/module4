package com.example.demo.repository;

import com.example.demo.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}
