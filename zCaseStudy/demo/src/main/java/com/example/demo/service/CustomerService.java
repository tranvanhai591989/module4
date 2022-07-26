package com.example.demo.service;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void deleteCustomerByCustomerId(int id);

    Customer findById(int id);

    Page<Customer> searchByName(String name, Pageable pageable);
}
