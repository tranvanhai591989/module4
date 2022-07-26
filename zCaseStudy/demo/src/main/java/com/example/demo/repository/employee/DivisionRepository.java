package com.example.demo.repository.employee;

import com.example.demo.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
