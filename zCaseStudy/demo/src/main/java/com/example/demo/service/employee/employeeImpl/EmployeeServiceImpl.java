package com.example.demo.service.employee.employeeImpl;

import com.example.demo.model.employee.Employee;
import com.example.demo.repository.employee.EmployeeRepository;
import com.example.demo.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee.getEmployeeName(),employee.getEmployeeBirth(),employee.getEmployeeIdCard(),employee.getEmployeeSalary()
        ,employee.getEmployeePhoneNumber(),employee.getEmployeeEmail(),employee.getEmployeeAddress(),employee.getPosition(),employee.getEducationDegree()
        ,employee.getDivision(),employee.getUsers(),employee.getEmployeeId());
    }

    @Override
    public void deleteEmployeeByEmployeeId(int id) {
        employeeRepository.deleteEmployeeByEmployeeId(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Page<Employee> searchByName(String name, Pageable pageable) {
        return employeeRepository.searchByName("%" + name + "%",pageable);
    }
}
