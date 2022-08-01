//package com.example.demo.controller;
//
//import com.example.demo.dto.FacilityDto;
//import com.example.demo.model.facility.Facility;
//import com.example.demo.service.facility.FacilityService;
//import com.example.demo.service.facility.FacilityTypeService;
//import com.example.demo.service.facility.RentTypeService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/facility")
//public class FacilityController {
//    @Autowired
//    private FacilityService facilityService;
//    @Autowired
//    private FacilityTypeService facilityTypeService;
//    @Autowired
//    private RentTypeService rentTypeService;
//
//    @GetMapping()
//    public String showList(@PageableDefault(value = 4) Pageable pageable, Model model) {
//        model.addAttribute("list", facilityService.findAll(pageable));
//        return "facility/facilityIndex";
//    }
//
//    @GetMapping("create")
//    public String showCreate(Model model) {
//        model.addAttribute("facility", new FacilityDto());
//        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
//        model.addAttribute("rentTypeList", rentTypeService.findAll());
//        return "facility/facilityCreate";
//    }
//
//    @PostMapping("save")
//    public String save(@ModelAttribute Facility facility) {
//        Facility facility1 = new Facility();
//        BeanUtils.copyProperties(facility, facility1);
//        facilityService.save(facility1);
//        return "redirect:/facility/facilityIndex";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String showEdit(@PathVariable int id, Model model) {
//        FacilityDto facilityDto = new FacilityDto();
//        Optional<Facility> facility = facilityService.findById(id);
//        BeanUtils.copyProperties(facility, facilityDto);
//        model.addAttribute("facility", facilityDto);
//        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
//        model.addAttribute("rentTypeList", rentTypeService.findAll());
//        return "facility/facilityEdit";
//    }
//
//    @PostMapping("update")
//    public String edit(@ModelAttribute("facilityDto") @Validated FacilityDto facilityDto, Model model) {
//        Facility facility = new Facility();
//        BeanUtils.copyProperties(facilityDto, facility);
//        facilityService.save(facility);
//        return "redirect:/facility";
//    }
//
//    @PostMapping("/delete")
//    public String delete(@RequestParam int id, RedirectAttributes redirect) {
//        facilityService.deleteFacilityByFacilityId(id);
//        redirect.addFlashAttribute("success", "Delete successfully!");
//        return "redirect:/facility";
//    }
//    @GetMapping("/search")
//    public String search(@RequestParam("name") String name, @PageableDefault(value = 4) Pageable pageable, Model model) {
//        model.addAttribute("employeeList", facilityService.searchByName(name, pageable));
//        model.addAttribute("search", name);
//        return "facility/facilityIndex";
//    }
//}