package com.example.product_managment.controller;

import com.example.product_managment.dto.ProductDto;
import com.example.product_managment.model.Product;
import com.example.product_managment.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("productDto") ProductDto productDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            productService.save(product);
            redirect.addFlashAttribute("success", "Create product successfully!");
            return "redirect:/product";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect) {
        productService.update( product);
        redirect.addFlashAttribute("success", "Update product " +
                product.getName() + " successfully!");
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        productService.remove(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/product";
    }

    @PostMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("productList", productService.findProductByName(name));
        return "/index";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }
}
