package com.example.demo.service.employee;

import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeByEmployeeId(int id);

    Employee findById(int id);
    Page<Employee> searchByName(String name, String position, Pageable pageable);
}
