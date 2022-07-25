package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Contract;
import com.example.demo.model.Customer;
import com.example.demo.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ContractService contractService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private EducationDegreeService educationDegreeService;

    @GetMapping("")
    public String index(@PageableDefault(value =3)  Pageable pageable,Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customerList", customerList);
        List<Contract> contractList =  contractService.findAll();
        model.addAttribute("contractList",contractList);
        return "customer/customerIndex";
    }




    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        model.addAttribute("divisionList",divisionService.findAll());
        return "customer/customerCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("accountDto") @Validated CustomerDto customerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/customerCreate";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirect.addFlashAttribute("success", "Update  successfully!");
            return "redirect:/customer";
        }

    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        Optional<Customer> customer = customerService.findById(id);
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customer", customer);
        model.addAttribute("customerList", customerList);
        return "customer/customerEdit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect) {
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Update Customer " +
                customer.getCustomerId() + " successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        customerService.deleteCustomerByCustomerId(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/customer";
    }
}
