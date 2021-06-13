package com.metanit.classes.interfaces;

public class Robot implements Printable, Soundable {
    private String name;
    private String currentTask;

    public Robot(String name, String currentTask) {
        this.name = name;
        this.currentTask = currentTask;
    }

    @Override
    public void printMessage() {
        System.out.println("Robot "+ name + " currently doing " + currentTask);
    }

    @Override
    public void sound() {
        System.out.println("BZZZZ");
    }
}
