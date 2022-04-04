package com.example.springboot.model;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;

    public Person(UUID id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
