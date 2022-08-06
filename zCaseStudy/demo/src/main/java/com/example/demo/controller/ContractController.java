package com.example.demo.controller;

import com.example.demo.dto.TotalMoneyDto;
import com.example.demo.model.contract.Contract;
import com.example.demo.model.contract.ContractDetail;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Position;
import com.example.demo.model.facility.AttachFacility;
import com.example.demo.model.facility.Facility;
import com.example.demo.service.contract.ContractService;
import com.example.demo.service.contract.contractImpl.AttachFacilityServiceImpl;
import com.example.demo.service.contract.contractImpl.ContractDetailServiceImpl;
import com.example.demo.service.customer.CustomerService;
import com.example.demo.service.customer.customerImpl.CustomerServiceImpl;
import com.example.demo.service.facility.facilityImpl.FacilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;

    @Autowired
    private AttachFacilityServiceImpl attachFacilityService;

    @Autowired
    private CustomerServiceImpl customerService;

    @Autowired
    private FacilityServiceImpl facilityService;

    @Autowired
    private ContractDetailServiceImpl contractDetailService;

    @ModelAttribute(value = "contractList")
    public void findAllContract(Model model) {
        List<Contract> contractList =  this.contractService.findAll();
        model.addAttribute("contractList",contractList);
    }

    @ModelAttribute(value = "attachFacilityS")
    public void findAllAttachFacility(Model model) {
        List<AttachFacility> attachFacilityS =  this.attachFacilityService.findAllAttach();
        model.addAttribute("attachFacilityS",attachFacilityS);
    }
    @ModelAttribute(value = "facilityList")
    public void findAllFacility(Model model) {
        List<Facility> facilityList =  this.facilityService.findAllFacility();
        model.addAttribute("facilityList",facilityList);
    }

    @ModelAttribute(value = "customerList")
    public void findAllCustomer(Model model) {
        List<Customer> customerList =  this.customerService.findAllCustomer();
        model.addAttribute("customerList",customerList);
    }

    @ModelAttribute(value = "totalMoney")
    public void totalMoney(Model model) {
        List<TotalMoneyDto> totalMoney =  this.contractService.TotalMoneyDto();
        model.addAttribute("totalMoney",totalMoney);
    }

    @GetMapping("")
    public String index() {
        return "contract/contractIndex";
    }

    @GetMapping("showAttach/{id}")
    public String showAttach(@PathVariable int id, Model model) {
        List<AttachFacility> attachFacilityList = attachFacilityService.findAll(id);
        model.addAttribute("attachFacilityList", attachFacilityList);
        model.addAttribute("flag", 1);
        return "contract/contractIndex";
    }

    @PostMapping("createContract")
    public ResponseEntity<?> createContract(@RequestBody Contract contract) {
        contractService.create(contract);
        // trick laays contract Id
        int contractId = 0;
        for (Contract item: contractService.findAll()) {
            contractId = item.getContractId();
        }
        return new ResponseEntity<>(contractId, HttpStatus.OK);
    }

    @PostMapping("createContractDetail")
    public ResponseEntity createContractDetail(@RequestBody String[][] contractDetailList) {
        for (int i = 0; i < contractDetailList.length; i++) {
            ContractDetail contractDetail = new ContractDetail(new Contract(Integer.parseInt(contractDetailList[i][1])), new AttachFacility(Integer.parseInt(contractDetailList[i][2])), Integer.parseInt(contractDetailList[i][0]));
            contractDetailService.save(contractDetail);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("totalMoney")
    public ResponseEntity<?> totalMoney(@RequestBody String [][] totalMoneyList, @RequestParam int facilityId) {
        double facilityCost = 0;
        double totalMoneyAttach = 0;
        double totalMoney =0;
        List<Facility> facilityList = facilityService.findAllFacility();
        for (Facility item: facilityList) {
            if (item.getFacilityId() == facilityId) {
                facilityCost = item.getFacilityCost();
            }
        }

        for (int i = 0; i < totalMoneyList.length; i++) {
            totalMoneyAttach = totalMoneyAttach + (Integer.parseInt(totalMoneyList[i][0]) * Double.parseDouble(totalMoneyList[i][1]));
        }

        totalMoney = facilityCost + totalMoneyAttach;
        return new ResponseEntity<>(totalMoney, HttpStatus.OK);
    }
}
