package codegym.hai.exercise_blog.controller;

import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.model.Type;
import codegym.hai.exercise_blog.service.BlogService;
import codegym.hai.exercise_blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private  BlogService blogService;

    @Autowired
    private TypeService typeService;

    @GetMapping("")
    public String index(@PageableDefault(value = 1) Pageable pageable, Model model) {

        model.addAttribute("blogList",  blogService.findAll(pageable));
        List<Type> typeList=typeService.findAll();
        model.addAttribute("typeList", typeList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<Type> typeList=typeService.findAll();
        model.addAttribute("typeList", typeList);
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("blog") Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Update  successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("blog") Blog blog, RedirectAttributes redirect) {
        blogService.update(blog);

        redirect.addFlashAttribute("success", "Update product " +
                blog.getId() + " successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        blogService.delete(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/blog";
    }


    @PostMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("blogList", blogService.searchByName(name));
        return "/index";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }
}
