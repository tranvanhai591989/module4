package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Division;
import com.example.demo.model.EducationDegree;
import com.example.demo.model.Employee;
import com.example.demo.model.Position;
import com.example.demo.service.DivisionService;
import com.example.demo.service.EducationDegreeService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
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

    @GetMapping("")
    public String index(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "employee/employeeIndex";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<Position> positionList =positionService.findAll();
        List<EducationDegree> educationDegreeList = educationDegreeService.findAll();
        List<Division> divisionList = divisionService.findAll();

        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("positionList", positionList);
        model.addAttribute("educationDegreeList", educationDegreeList);
        model.addAttribute("divisionList", divisionList);
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
        Optional<Employee> employee = employeeService.findById(id);
        List<Employee> employeeList = employeeService.findAll();
        List<Position> positionList = positionService.findAll();
        List<EducationDegree> educationDegreeList = educationDegreeService.findAll();
        List<Division> divisionList = divisionService.findAll();
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("positionList", positionList);
        model.addAttribute("educationDegreeList", educationDegreeList);
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("employee", employee);
        model.addAttribute("employeeList", employeeList);
        return "employee/employeeEdit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("employee") Employee employee, RedirectAttributes redirect) {
        employeeService.save(employee);
        redirect.addFlashAttribute("success", "Update employee " +
                employee.getEmployeeName() + " successfully!");
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        employeeService.deleteEmployeeByEmployeeId(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/employee";
    }
}
