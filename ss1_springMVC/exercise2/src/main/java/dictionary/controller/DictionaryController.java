package dictionary.controller;

import dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;

    @GetMapping
    public String index() {
        return "page";
    }

    @PostMapping
    public String submit(@RequestParam String english, Model model) {
        String answer = dictionaryService.getData(english);
        model.addAttribute("answer", answer);
        model.addAttribute("english", english);
        return "page";
    }

}
