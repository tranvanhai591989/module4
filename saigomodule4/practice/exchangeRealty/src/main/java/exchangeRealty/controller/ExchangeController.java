package exchangeRealty.controller;

import exchangeRealty.dto.ExchangeDto;
import exchangeRealty.model.Customer;
import exchangeRealty.model.Exchange;
import exchangeRealty.service.CustomerService;
import exchangeRealty.service.ExchangeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("exchange")
public class ExchangeController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ExchangeService exchangeService;

    @ModelAttribute(value = "customerList")
    public void findAllCustomer(Model model) {
        List<Customer> customerList = this.customerService.findAll();
        model.addAttribute("customerList", customerList);
    }

    @GetMapping("")
    public ModelAndView search(@RequestParam(value = "search", defaultValue = "") String search,
                               @RequestParam(defaultValue = "") String exchangeType, Pageable pageable) {
        Page<Exchange> exchangeList = exchangeService.findAllExchange(search, exchangeType, pageable);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("exchangeList", exchangeList);
        return modelAndView;
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("exchangeDto", new ExchangeDto());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute @Validated ExchangeDto exchangeDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Exchange exchange = new Exchange();
            BeanUtils.copyProperties(exchangeDto, exchange);
            exchangeService.save(exchange);
            redirectAttributes.addFlashAttribute("success", "Create OK!");
        }
        return "redirect:/transaction";
    }


    @GetMapping("/{id}/detail")
    public ModelAndView showDetail(@PathVariable int id) {
        Exchange exchange = exchangeService.findByiId(id).get();
        return new ModelAndView("detail",
                "exchange", exchangeService.findByiId(id).get());
    }

}
