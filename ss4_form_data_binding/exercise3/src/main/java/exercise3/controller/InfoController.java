package exercise3.controller;

import exercise3.model.Info;
import exercise3.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping
    public String getAll(Model model) {
        List<Info> infoList = infoService.getAll();
        model.addAttribute("infoList", infoList);
        return "list";
    }

    @GetMapping (value = "/create")
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

    @GetMapping("/create-info")
    public String create(@ModelAttribute("infoForm") Info info, RedirectAttributes redirectAttributes) {
        infoService.create(info);
        redirectAttributes.addFlashAttribute("message", "Success");
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String formUpdate(@PathVariable String id, Model model) {
        model.addAttribute("birthdayList", infoService.getBirthYear());
        model.addAttribute("genderList", infoService.getGender());
        model.addAttribute("nalionalityList", infoService.getNational());
        model.addAttribute("transportType", infoService.getTransportType());
        model.addAttribute("inputDay", infoService.getInputDay());
        model.addAttribute("inputMonth", infoService.getInputMonth());
        model.addAttribute("inputYear", infoService.getInputYear());
        model.addAttribute("outDay", infoService.getOutDay());
        model.addAttribute("outMonth", infoService.getOutMonth());
        model.addAttribute("outYear", infoService.findId(id));
        return "update";
    }

//    @GetMapping("/update")
//    public String update(@ModelAttribute("infoForm") String id, Info info, RedirectAttributes redirectAttributes) {
//        infoService.update(id, info);
//        redirectAttributes.addFlashAttribute("message", "update success");
//        return "redirect:/list";
//    }

}
