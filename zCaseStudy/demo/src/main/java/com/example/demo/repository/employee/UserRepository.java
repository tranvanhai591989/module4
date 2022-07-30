package com.example.demo.repository.employee;

import com.example.demo.model.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {
}
