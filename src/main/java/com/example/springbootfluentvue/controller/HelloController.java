package com.example.springbootfluentvue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String home() {

        System.out.println("===Home Page===");

        return "Home page";
    }
}
