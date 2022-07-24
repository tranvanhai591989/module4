package com.example.demo.repository;

import com.example.demo.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
