package com.bridgelabz.greetingsapplication.repository;

import com.bridgelabz.greetingsapplication.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
