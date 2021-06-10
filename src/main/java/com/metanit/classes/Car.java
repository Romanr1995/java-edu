package com.metanit.classes;

public class Car {
    String model;
    double power;
    String color;
    long mileage;
    long price;
    int yearOfProduction;

    Car(String model_,
        double power_,
        String color_,
        long mileage_,
        long price_,
        int yearOfProduction_) {

        model = model_;
        power = power_;
        color = color_;
        mileage = mileage_;
        price = price_;
        yearOfProduction = yearOfProduction_;
    }
}
