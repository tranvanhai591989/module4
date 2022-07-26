package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Contract;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.customer.CustomerType;
import com.example.demo.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    private  CustomerTypeService customerTypeService;

    @GetMapping("")
    public String index(@PageableDefault(value =3)  Pageable pageable,Model model) {
        model.addAttribute("customerList",  customerService.findAll(pageable));
        return "customer/customerIndex";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        model.addAttribute("customerTypeList",customerTypeList);
        List<Contract> contractList =  contractService.findAll();
        model.addAttribute("contractList",contractList);
        return "customer/customerCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customerDto") @Validated CustomerDto customerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList",customerTypeList);
            List<Contract> contractList =  contractService.findAll();
            model.addAttribute("contractList",contractList);
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
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customerService.findById(id),customerDto);
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerTypeList", customerTypeList);
        return "customer/customerEdit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("customerDto")@Validated CustomerDto customerDto,
                         BindingResult bindingResult,RedirectAttributes redirect,Model model) {
        if (bindingResult.hasFieldErrors()){
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            return "customer/customerEdit";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.save(customer);
            redirect.addFlashAttribute("success", "Update Customer " +
                    customer.getCustomerId() + " successfully!");
            return "redirect:/customer";
        }

    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        customerService.deleteCustomerByCustomerId(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, @PageableDefault(value = 4) Pageable pageable, Model model) {
        model.addAttribute("customerList", customerService.searchByName(name, pageable));
        model.addAttribute("search", name);
        return "customer/customerIndex";
    }
}
