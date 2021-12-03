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

    /**
     * Purpose - To inject greetingService dependency
     */
    @Autowired
    GreetingServices greetingServices;

    /**
     * Purpose - To add URI path to greeting
     * @return greeting
     */
    @RequestMapping("/greeting")
    public String greet(){
        return "Welcome to my project";
    }

    /**
     * Purpose - To read the content present in specified path
     * @return greeting message
     */
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from lokesh";
    }

    /**
     * Purpose    - To use the path variable as param
     * @param name - Name is taken from the Path Variable and used in method through parameter
     * @return  Specified String
     */
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello from " +name;
    }

    /**
     * Purpose      - To get the parameter from client
     * @param fname - It requests param firstname from client and used in method.
     * @param lname - It requests param lastname from client and used in method.
     * @return      - Specified Greetings
     */
    @GetMapping("/getParam")
    public String greeting(@RequestParam String fname, @RequestParam String lname) {
        return "Hello" +fname+" "+lname;
    }

    /**
     * Purpose - To Add greeting object to repository
     * @param greeting - It takes greeting message and id from the client and stores in repository
     * @return - The added Greeting object
     */
    @PostMapping("/addGreeting")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingServices.addGreeting(greeting);
    }

    /**
     * Purpose - To Update the Existing Object
     * @param greeting - It updates the existing greeting message and id from the client and stores in repository
     * @return - The updated Greeting Object
     */
    @PutMapping("/updateGreeting")
    public Greeting updateGreeting(@RequestBody Greeting greeting){
        return greetingServices.updateGreeting(greeting);
    }

    /**
     * Purpose - To delete the existing Resource
     * @param id - It delets greeting message based on id from the client if it present in repository
     * @return - Custom message After deleted
     */
    @DeleteMapping(value = "/deleteGreeting")
    public String deleteGreeting(@RequestParam int id) {
        return greetingServices.deleteGreeting(id);
    }
}
