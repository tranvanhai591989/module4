package com.example.demo.repository.customer;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    void deleteCustomerByCustomerId(int id);
    Page<Customer> findAll(Pageable pageable);
    @Query(value = "select * from customer where customer_name like :name ", nativeQuery = true)
    Page<Customer> searchByName(@Param("name") String name, Pageable pageable);
}
