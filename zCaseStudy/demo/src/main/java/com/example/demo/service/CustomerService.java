package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void deleteCustomerByCustomerId(int id);

    Optional<Customer> findById(int id);
}
