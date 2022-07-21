package com.example.exercise2.service.impl;

import com.example.exercise2.model.Customer;
import com.example.exercise2.repository.CustomerRepository;
import com.example.exercise2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class SimpleCustomerServiceImpl implements CustomerService {
   @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
customerRepository.deleteById(id);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer.getName(),customer.getEmail(),customer.getAddress(),customer.getId());

    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return null;
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return null;
    }
}
