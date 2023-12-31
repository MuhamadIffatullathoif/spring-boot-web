package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
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

    @GetMapping("/list")
    public String list(ModelMap modelMap){
        // List<User> users = Arrays.asList(
        //        new User("Muhammad", "Iffat","Iffat@gmail.com"),
        //        new User("Iffat", "Muhammad")
        // );
        // modelMap.addAttribute("users", users);
        modelMap.addAttribute("title", "List of User");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Muhammad", "Iffat","Iffat@gmail.com"),
                new User("Iffat", "Muhammad")
        );
    }
}
