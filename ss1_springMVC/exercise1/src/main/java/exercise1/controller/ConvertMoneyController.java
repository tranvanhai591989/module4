package exercise1.controller;

import exercise1.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @Autowired
    private ConvertService convertService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping
    public String submit(@RequestParam double usd, Model model) {
        double result = convertService.convert(usd);
        model.addAttribute("result", result);
        return "index";
    }
}
