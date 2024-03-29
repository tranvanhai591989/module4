package com.example.demo.service.customer.customerImpl;

import com.example.demo.model.customer.CustomerType;
import com.example.demo.repository.customer.CustomerTypeRepository;
import com.example.demo.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
