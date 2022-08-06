package com.example.demo.service.contract;

import com.example.demo.model.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    void save(ContractDetail contractDetail);

    List<ContractDetail> findAll();

}
