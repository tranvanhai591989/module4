package com.example.demo.service.contract.contractImpl;

import com.example.demo.dto.TotalMoneyDto;
import com.example.demo.model.contract.Contract;
import com.example.demo.model.contract.ContractDetail;
import com.example.demo.model.facility.AttachFacility;
import com.example.demo.model.facility.Facility;
import com.example.demo.repository.contract.ContractRepository;
import com.example.demo.repository.facility.FacilityRepository;
import com.example.demo.service.contract.ContractService;
import com.example.demo.service.facility.facilityImpl.FacilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private FacilityServiceImpl facilityService;

    @Autowired
    private ContractDetailServiceImpl contractDetailService;

    @Autowired
    private AttachFacilityServiceImpl attachFacilityService;


    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public void create(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<TotalMoneyDto> TotalMoneyDto() {
        List<Facility> facilityList = facilityService.findAllFacility();
        List<Contract> contractList = contractRepository.findAll();
        List<ContractDetail> contractDetailList = contractDetailService.findAll();
        List<AttachFacility> attachFacilityList = attachFacilityService.findAllAttach();
        List<TotalMoneyDto> totalMoneyDtoList = new ArrayList<>();




        for (int i = 0; i < contractList.toArray().length; i++) {
            double totalMoney = 0;
            double facilityCost = 0;
            double contractDetailCost = 0;

            facilityCost = contractList.get(i).getFacility().getFacilityCost();
            for (ContractDetail contractDetail : contractDetailList) {
                if (contractList.get(i).getContractId() == contractDetail.getContract().getContractId()) {
                    for (AttachFacility attachFacility : attachFacilityList) {
                        if (contractDetail.getAttachFacility().getAttachFacilityId() == attachFacility.getAttachFacilityId()) {
                            contractDetailCost = contractDetailCost + (contractDetail.getQuantity() * attachFacility.getAttachFacilityCost());
                        }
                    }
                }
            }

            totalMoney = facilityCost + contractDetailCost;
            totalMoneyDtoList.add(new TotalMoneyDto(contractList.get(i).getContractId(), contractList.get(i).getStartDate(), contractList.get(i).getEndDate(),
                    contractList.get(i).getDeposit(), contractList.get(i).getEmployee(), contractList.get(i).getCustomer(), contractList.get(i).getFacility(), totalMoney));
        }

        return totalMoneyDtoList;
    }
}
