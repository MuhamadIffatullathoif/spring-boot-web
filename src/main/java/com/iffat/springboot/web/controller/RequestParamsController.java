package com.iffat.springboot.web.controller;

import com.iffat.springboot.web.model.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hello, How are you?") String message) {
        ParamDto params = new ParamDto();
        params.setMessage(message);
        return params;
    }
}
