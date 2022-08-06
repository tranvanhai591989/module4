package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/403")
    public String error(Model model) {
        return "403";
    }
}
