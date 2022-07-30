package com.example.demo.repository.contract;

import com.example.demo.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
}
