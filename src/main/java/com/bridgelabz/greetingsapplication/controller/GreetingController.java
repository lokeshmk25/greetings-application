package com.bridgelabz.greetingsapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String greet(){
        return "Welcome to my project";
    }
}
