package exercise1.controller;

import exercise1.model.Music;
import exercise1.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    @GetMapping("")
    public String index(Model model) {
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList", musicList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/save")
    public String save(Music music, RedirectAttributes redirect) {
        musicService.save(music);
        redirect.addFlashAttribute("success", "Create  successfully!");
        return "redirect:/music";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Music music, RedirectAttributes redirect) {
        musicService.update(music.getId(), music);
        redirect.addFlashAttribute("success", "Update product " +
                music.getName() + " successfully!");
        return "redirect:/music";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        musicService.remove(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/music";
    }


    @PostMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("musicList", musicService.findByName(name));
        return "/index";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "/view";
    }
}
