package com.bridgelabz.greetingsapplication.controller;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getParam")
    public String greeting(@RequestParam String fname, @RequestParam String lname) {
        return "Hello" +fname+" "+lname;
    }

}
