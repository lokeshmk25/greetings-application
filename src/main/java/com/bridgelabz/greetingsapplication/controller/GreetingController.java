package com.bridgelabz.greetingsapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lokesh
 * @since 03-12-2021
 * Purpose - To demonstrate different HTTP methods
 */
@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greet(){
        return "Welcome to my project";
    }


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from lokesh";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello from " +name;
    }
}
