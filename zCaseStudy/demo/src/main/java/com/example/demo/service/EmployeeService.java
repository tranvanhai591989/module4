package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    void deleteEmployeeByEmployeeId(int id);

    Optional<Employee> findById(int id);
}
