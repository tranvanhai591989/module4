package com.example.demo.repository;

import com.example.demo.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
