package com.bridgelabz.greetingsapplication.services;

import com.bridgelabz.greetingsapplication.entity.Greeting;
import com.bridgelabz.greetingsapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServices {

    @Autowired
    GreetingRepository greetingRepository;

    public String sayHello(){
        return "HelloWorld";
    }
    /**
     * Function to add greetings and save greetings to the database
     * @param greeting greeting data from client
     * @return greeting messages added
     */
    public Greeting addGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
}
