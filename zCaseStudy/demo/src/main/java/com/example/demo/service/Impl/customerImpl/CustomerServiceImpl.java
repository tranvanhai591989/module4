package com.example.demo.service.Impl.customerImpl;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.customer.CustomerRepository;
import com.example.demo.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerByCustomerId(int id) {
        customerRepository.deleteCustomerByCustomerId(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Page<Customer> searchByName(String name, Pageable pageable) {
        return customerRepository.searchByName("%" + name + "%", pageable);
    }
}
