package com.bridgelabz.greetingsapplication.controller;

import com.bridgelabz.greetingsapplication.entity.Greeting;
import com.bridgelabz.greetingsapplication.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lokesh
 * @since 03-12-2021
 * Purpose - To demonstrate different HTTP methods
 */
@RestController
public class GreetingController {
    @Autowired
    GreetingServices greetingServices;

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


    @PostMapping("/addGreeting")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingServices.addGreeting(greeting);
    }
}
