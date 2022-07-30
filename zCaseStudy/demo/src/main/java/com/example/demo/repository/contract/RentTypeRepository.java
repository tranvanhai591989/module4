package com.example.demo.repository.contract;

import com.example.demo.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RentTypeRepository extends JpaRepository<RentType, Integer> {
}
