package com.metanit.classes.inheritance;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("I'm " + name);
    }

    public String getName() {
        return name;
    }
}
