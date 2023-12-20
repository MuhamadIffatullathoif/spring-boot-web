package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Muhamad", "Iffat");
        model.addAttribute("title", "Hello world spring boot");
        model.addAttribute("user", user);
        // model.addAttribute("name","Muhamad");
        // model.addAttribute("lastname", "Iffat");
        return "details";
    }
}
