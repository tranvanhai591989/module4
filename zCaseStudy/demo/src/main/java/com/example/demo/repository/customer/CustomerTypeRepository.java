package com.example.demo.repository.customer;

import com.example.demo.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
