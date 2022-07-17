package mail.controller;

import mail.model.Mail;
import mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @GetMapping
    public String showAll(Model model) {
        model.addAttribute("mailList", mailService.findAll());
        return "account";
    }

    @PostMapping("/update")
    public String save(@ModelAttribute Mail mail, Model model) {
        mailService.update(mail);
        model.addAttribute("mailList", mailService.findAll());
        return "account";
    }

    @GetMapping("/update")
    public String displayEdit(@RequestParam int id, Model model) {
            model.addAttribute("mail", mailService.findById(id));
        model.addAttribute("languageList", mailService.languageList());
        model.addAttribute("pageSizeList", mailService.pageSize());
        return "update";
    }
}
