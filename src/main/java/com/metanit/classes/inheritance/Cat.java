package com.metanit.classes.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! I'm a cat " + getName());
    }
}
