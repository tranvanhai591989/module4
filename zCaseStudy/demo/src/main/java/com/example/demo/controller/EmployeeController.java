package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Position;
import com.example.demo.service.employee.DivisionService;
import com.example.demo.service.employee.EducationDegreeService;
import com.example.demo.service.employee.EmployeeService;
import com.example.demo.service.employee.PositionService;
import javafx.geometry.Pos;
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
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private DivisionService divisionService;

    @ModelAttribute(value = "positionList")
    public void findAllPosition(Model model) {
      List<Position> positionList =  this.positionService.findAll();
      model.addAttribute("positionList",positionList);
    }
    @ModelAttribute(value = "divisionList")
    public void findAllDivision(Model model) {
        List<Division> divisionList = divisionService.findAll();
        model.addAttribute("divisionList", divisionList);
    }
    @ModelAttribute(value = "educationDegreeList")
    public void findAllEducationDegree(Model model) {
        List<EducationDegree> educationDegreeList = educationDegreeService.findAll();
        model.addAttribute("educationDegreeList", educationDegreeList);
    }


    @GetMapping("")
    public String index(@RequestParam("name") Optional<String> name, @RequestParam(value = "position", defaultValue = "") String position,
                         @PageableDefault(value = 4) Pageable pageable, Model model) {
        model.addAttribute("employeeList", employeeService.searchByName(name.orElse(""),position, pageable));
        model.addAttribute("search", name.orElse(""));
        model.addAttribute("position", position);
        return "employee/employeeIndex";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/employeeCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            return "employee/employeeCreate";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employeeService.save(employee);
            redirect.addFlashAttribute("success", "Update  successfully!");
            return "redirect:/employee";
        }
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employeeService.findById(id), employeeDto);
        model.addAttribute("employeeDto", employeeDto);
        return "employee/employeeEdit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto,
                         BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "employee/employeeEdit";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employeeService.updateEmployee(employee);
            redirect.addFlashAttribute("success", "Update employee " +
                    employee.getEmployeeName() + " successfully!");
            return "redirect:/employee";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        employeeService.deleteEmployeeByEmployeeId(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/employee";
    }




}
