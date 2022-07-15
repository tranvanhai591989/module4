package exercise3.controller;

import exercise3.model.Info;
import exercise3.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping
    public String getAll(Model model) {
        List<Info> infoList = infoService.getAll();
        model.addAttribute("infoList", infoList);
        return "sample";
    }

    @GetMapping(value = "/create")
    public String getForm(@ModelAttribute("infoForm") Info info, ModelMap model) {
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
        model.addAttribute( new Info());
        return "sample";
    }

}
