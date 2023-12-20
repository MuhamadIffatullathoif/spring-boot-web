package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.User;
import com.iffat.springboot.web.model.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details2")
    public UserDto details() {
        User user = new User("Muhamad", "Iffat");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hello World Spring boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Muhammad", "Iffat");
        User user1 = new User("Iffat", "Muhammad");

        /* Single line */
        List<User> users = Arrays.asList(user, user1);

        /* Multi line */
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user1);
        return users;
    }

    @GetMapping("/details2-map")
    public Map<String, Object> detailsMap() {
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
