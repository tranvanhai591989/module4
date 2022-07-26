package com.example.demo.repository.employee;

import com.example.demo.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
