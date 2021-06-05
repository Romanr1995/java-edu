package com.metanit.classes;

import com.metanit.classes.inheritance.WeightedBox;

public class ClassesDemo {
    public static void main(String[] args) {
//        printAdsAboutCar("BMW", 400.0, "RED", 10, 20_000, 1996);

        Car car = new Car("BMW", 400.0, "RED", 20_000, 10, 1996);
        System.out.println(car.model);
        House house = new House("townhouse",104,"brick",1_000_000);
        SocialNetwork soc = new SocialNetwork("Roman",1995,"RUT","Moscow");
        BankAccount bankaccount = new BankAccount("dollars",50_000,2020);

        printAdsAboutCar(car);
        printAdsAboutHouse(house);
        soialNetworkPage(soc);
        bankAccountPrint(bankaccount);

    }

    public static void printAdsAboutCar(String model,
                                        double power,
                                        String color,
                                        long price,
                                        long mileage,
                                        int yearOfProduction) {
        System.out.println("-".repeat(80));
        System.out.println(model);
        System.out.println("color = " + color + " power = " + power);
        System.out.println("mileage = " + mileage);
        System.out.println("PRICE = " + price);
        System.out.println("-".repeat(80));
    }

    public static void printAdsAboutCar(Car car) {
        System.out.println("-".repeat(80));
        System.out.println(car.model);
        System.out.println("color = " + car.color + " power = " + car.power);
        System.out.println("mileage = " + car.mileage);
        System.out.println("PRICE = " + car.price);
        System.out.println("Year of production = " + car.yearOfProduction);
        System.out.println("-".repeat(80));
    }
    public static void printAdsAboutHouse(House house) {
        System.out.println("-".repeat(80));
        System.out.println(house.type);
        System.out.println("square House : " + house.square);
        System.out.println("wallmaterial : " + house.wallMaterial);
        System.out.println("PRICE = " + house.price);
        System.out.println("-".repeat(80));
    }
    public static void soialNetworkPage(SocialNetwork soc) {
        System.out.println("-".repeat(80));
        System.out.println(soc.name);
        System.out.println("JearOfBirth = " + soc.yearOfBirth);
        System.out.println("Age = " + (2021 - soc.yearOfBirth));
        System.out.println("University : " + soc.university);
        System.out.println("City : " + soc.city);
        System.out.println("-".repeat(80));
    }
    public static void bankAccountPrint(BankAccount bankaccount) {
        System.out.println("-".repeat(80));
        System.out.println("Account currency : " + bankaccount.currency);
        System.out.println("Balance = " + bankaccount.balance);
        System.out.println("Open : " + bankaccount.openingDate);
        System.out.println("-".repeat(80));
    }
}
