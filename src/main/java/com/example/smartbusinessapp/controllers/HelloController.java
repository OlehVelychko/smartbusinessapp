package com.example.smartbusinessapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Hello World");
        return "Hello, World!";
    }
}
