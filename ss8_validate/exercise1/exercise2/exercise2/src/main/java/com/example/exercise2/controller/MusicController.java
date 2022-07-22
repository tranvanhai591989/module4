package com.example.exercise2.controller;

import com.example.exercise2.dto.MusicDto;
import com.example.exercise2.model.Music;
import com.example.exercise2.service.MusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
        model.addAttribute("musicDto", new MusicDto());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("musicDto") @Validated MusicDto musicDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto,music);
            musicService.save(music);
            redirect.addFlashAttribute("success", "Create  successfully!");
            return "redirect:/music";
        }
    }


    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        musicService.remove(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/music";
    }


    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "/view";
    }
}
