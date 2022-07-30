package com.example.demo.repository.facility;

import com.example.demo.model.employee.Employee;
import com.example.demo.model.facility.Facility;
import com.example.demo.service.facility.FacilityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface FacilityRepository extends JpaRepository<Facility,Integer> {
    @Modifying
    @Query(value = "select * from facility where facility_name like :name ", nativeQuery = true)
    Page<Facility> searchByName(@Param("name") String name, Pageable pageable);

}
