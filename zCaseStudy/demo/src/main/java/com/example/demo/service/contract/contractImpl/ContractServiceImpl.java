package com.example.demo.service.contract.contractImpl;

import com.example.demo.model.contract.Contract;
import com.example.demo.repository.contract.ContractRepository;
import com.example.demo.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
private ContractRepository contractRepository;
    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
