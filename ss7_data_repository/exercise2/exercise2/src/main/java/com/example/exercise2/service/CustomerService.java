package com.example.exercise2.service;

import com.example.exercise2.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void delete(int id);

    void update(Customer customer);

    Optional<Customer> findById(Integer id);

    List<Customer> searchByName(String name);

    Page<Customer> findAll(Pageable pageable);

}
