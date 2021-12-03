package com.bridgelabz.greetingsapplication.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Greeting {
    @Id
    private int id;
    private String content;
}
