package com.example.demo.repository;

import com.example.demo.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    void deleteEmployeeByEmployeeId(int id);

    @Query(value = "select * from employee where employee_name like :name ", nativeQuery = true)
    Page<Employee> searchByName(@Param("name") String name, Pageable pageable);


    Page<Employee> findAll(Pageable pageable);

    @Modifying
    @Query(value = "update  employee  e set employee_name=:employeeName, employee_birth=:employeeBirth , employee_id_card=:employeeIdCard, employee_salary=:employeeSalary, employee_phone_number=:employeePhoneNumber , " +
            "  employee_email=:employeeEmail, employee_address=:employeeAddress , position_id=:position , education_degree_id=:educationDegree, division_id=:division  ,user_name=:users " +
            "where employee_id=:id", nativeQuery = true)
    void updateEmployee(@Param("employeeName") String employeeName, @Param("employeeBirth") String employeeBirth, @Param("employeeIdCard") String employeeIdCard, @Param("employeeSalary") double employeeSalary,
                        @Param("employeePhoneNumber") String employeePhoneNumber, @Param("employeeEmail") String employeeEmail, @Param("employeeAddress") String employeeAddress, @Param("position") Position position
            , @Param("educationDegree") EducationDegree educationDegree, @Param("division") Division division, @Param("users") User users, @Param("id") int id);

}
