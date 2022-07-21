package com.example.exercise2.repository;

import com.example.exercise2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Modifying
    @Query(value = "update  Customer  set name=:name," + " email=:email," + " address=:address where  id=:id", nativeQuery = true)
    void update(@Param("name") String name, @Param("email") String email, @Param("address") String address, @Param("id") int id);
}
