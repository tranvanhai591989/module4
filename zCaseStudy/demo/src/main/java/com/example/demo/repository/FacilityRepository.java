package com.example.demo.repository;

import com.example.demo.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface FacilityRepository extends JpaRepository<Facility,Integer> {
}
