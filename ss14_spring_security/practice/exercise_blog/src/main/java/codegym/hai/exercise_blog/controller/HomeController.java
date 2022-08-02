package codegym.hai.exercise_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login/login";
    }
}
