package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.User;
import com.iffat.springboot.web.model.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;

    @Value("${config.code}")
    private Integer code;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private String[] valueList;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("listOfValues", listOfValues);
        json.put("message", message);
        json.put("valueList", valueList);
        json.put("valueString", valueString);
        return json;
    }

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }


    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
