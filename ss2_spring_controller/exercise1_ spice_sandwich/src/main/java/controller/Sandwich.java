package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @GetMapping("/")
    public String loadIndex() {
        return "index";
    }

    @RequestMapping(path = "/save")
    public String save(@RequestParam("condiment") String[] condiment, ModelMap modelMap) {
        // có thể bỏ ("condiment") sau @RequestParam nhung sau String[] thì
        // phải mapping với name của dữ liệu cần lấy
        modelMap.addAttribute("condiment", condiment);
        return "index";
    }
}