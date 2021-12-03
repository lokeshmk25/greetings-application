package com.bridgelabz.greetingsapplication.repository;

import com.bridgelabz.greetingsapplication.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lokesh
 * @since 03-12-2021
 * Purpose - To create Repository to store Objects
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
