package exercise3.controller;

import exercise3.model.Info;
import exercise3.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping()
    public String getAll(Model model) {
        List<Info> infoList = infoService.getAll();
        model.addAttribute("infoList", infoList);
        return "list";
    }

    @GetMapping(value = "/create")
    public String getFormCreate(Model model) {
        model.addAttribute("info", new Info());
        model.addAttribute("birthdayList", infoService.getBirthYear());
        model.addAttribute("genderList", infoService.getGender());
        model.addAttribute("nalionalityList", infoService.getNational());
        model.addAttribute("transportType", infoService.getTransportType());
        model.addAttribute("inputDay", infoService.getInputDay());
        model.addAttribute("inputMonth", infoService.getInputMonth());
        model.addAttribute("inputYear", infoService.getInputYear());
        model.addAttribute("outDay", infoService.getOutDay());
        model.addAttribute("outMonth", infoService.getOutMonth());
        model.addAttribute("outYear", infoService.getOutYear());
        return "sample";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("infoForm") Info info, RedirectAttributes redirectAttributes) {
        infoService.create(info);
        redirectAttributes.addFlashAttribute("message", "Create Success");
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String formUpdate(@RequestParam String id, Model model) {
        Info info = infoService.findId(id);
        model.addAttribute("infoForm", info);
        model.addAttribute("birthdayList", infoService.getBirthYear());
        model.addAttribute("genderList", infoService.getGender());
        model.addAttribute("nalionalityList", infoService.getNational());
        model.addAttribute("transportType", infoService.getTransportType());
        model.addAttribute("inputDay", infoService.getInputDay());
        model.addAttribute("inputMonth", infoService.getInputMonth());
        model.addAttribute("inputYear", infoService.getInputYear());
        model.addAttribute("outDay", infoService.getOutDay());
        model.addAttribute("outMonth", infoService.getOutMonth());
        model.addAttribute("outYear", infoService.getOutYear());
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Info info, Model model, RedirectAttributes redirectAttributes) {
        infoService.update(info);
        model.addAttribute("infoList", infoService.getAll());
        redirectAttributes.addFlashAttribute("message", "Update Success");
        return "redirect:/list";
    }

}
