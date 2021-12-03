package com.bridgelabz.greetingsapplication.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author lokesh
 * @since 03-12-21
 * Purpose - To create entities of Greeting class
 */
@Entity
@Data
public class Greeting {
    @Id
    private int id;
    private String content;
}
