package com.example.demo.service.contract;

import com.example.demo.dto.TotalMoneyDto;
import com.example.demo.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
   List<Contract>findAll();

   void create(Contract contract);

   List<TotalMoneyDto> TotalMoneyDto();
}
