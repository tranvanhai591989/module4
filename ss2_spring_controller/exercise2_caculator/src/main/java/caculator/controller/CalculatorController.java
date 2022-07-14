package caculator.controller;

import caculator.service.CalculatorService;
import caculator.service.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/")
    public String calculator() {
        return "calculation";
    }

    @GetMapping("cal")
    public String calculation(@RequestParam String calculation,
                              @RequestParam(defaultValue = "0") float num1,
                              @RequestParam(defaultValue = "0") float num2, Model model) {
        float total = calculatorService.calculation(calculation, num1, num2);
        model.addAttribute("total", total);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "calculation";
    }
}
