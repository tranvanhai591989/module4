package com.example.demo.repository.employee;

import com.example.demo.model.employee.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
