package exercise1.controller;

import exercise1.dto.AccountDto;
import exercise1.model.Account;
import exercise1.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("")
    public String index(Model model) {
        List<Account> accountList = accountService.findAll();
        model.addAttribute("accountList", accountList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("accountDto", new AccountDto());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("accountDto") @Validated AccountDto accountDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Account account = new Account();
            BeanUtils.copyProperties(accountDto, account);
            accountService.save(account);
            redirect.addFlashAttribute("success", "Update  successfully!");
            return "redirect:/account";
        }

    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        Optional<Account> account = accountService.findById(id);
        List<Account> accountList = accountService.findAll();
        model.addAttribute("account", account);
        model.addAttribute("accountList", accountList);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("account") Account account, RedirectAttributes redirect) {
        accountService.save(account);
        redirect.addFlashAttribute("success", "Update product " +
                account.getId() + " successfully!");
        return "redirect:/account";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        accountService.delete(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/account";
    }

}
