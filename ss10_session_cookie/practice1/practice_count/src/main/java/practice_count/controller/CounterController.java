package practice_count.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice_count.model.Counter;

@Controller
    @SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.increment();
        return "/index";
    }
}