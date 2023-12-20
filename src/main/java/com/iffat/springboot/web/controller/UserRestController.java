package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details2")
    public Map<String, Object> details() {
        User user = new User("Muhamad", "Iffat");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello World Spring boot");
        body.put("user", user);
        //body.put("title","Hello World Spring boot");
        //body.put("name","Muhammad");
        //body.put("lastname","Iffat");
        return body;
    }
}
