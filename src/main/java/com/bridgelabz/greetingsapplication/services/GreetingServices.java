package com.bridgelabz.greetingsapplication.services;

import com.bridgelabz.greetingsapplication.entity.Greeting;
import com.bridgelabz.greetingsapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author lokesh
 * @since 03-12-21
 * Purpose - To create Greeting service
 */
@Service
public class GreetingServices {

    @Autowired
    GreetingRepository greetingRepository;

    /**
     * Purpose - To create simple Greeting message
     * @return greeting
     */
    public String sayHello(){
        return "HelloWorld";
    }

    /**
     * Purpose - To find all Greeting object
     * @return - objects of greeting
     */
    public List<Greeting> greetings() {
        return greetingRepository.findAll();
    }
    /**
     * Purpose - To add greetings and save greetings to the database
     * @param greeting - greeting data from client
     * @return - greeting messages added
     */
    public Greeting addGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    /**
     * Purpose - To update the existing greeting data and save it
     * @param greeting - Greeting is used to get data from client
     * @return - updated data
     */
    public Greeting updateGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    /**
     *
     * @param id - Deletes the Data by id provided by client
     * @return - custom message
     */
    public String deleteGreeting(int id) {
        Optional<Greeting>byId= greetingRepository.findById(id);
        if(byId.isPresent()){
            greetingRepository.delete(byId.get());
        }
        return "Deleted sucessfully";
    }
}
