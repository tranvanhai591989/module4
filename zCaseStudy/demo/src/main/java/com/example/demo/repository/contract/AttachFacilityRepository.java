package com.example.demo.repository.contract;

import com.example.demo.model.facility.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface AttachFacilityRepository extends JpaRepository<AttachFacility,Integer> {
}
