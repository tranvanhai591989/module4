package com.example.demo.repository;

import com.example.demo.model.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface FacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
}
