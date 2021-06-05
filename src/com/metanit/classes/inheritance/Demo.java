package com.metanit.classes.inheritance;

public class Demo {
    public static void main(String[] args) {
        Box box = new Box(12, 10, 1);
        WeightedBox weightedBox = new WeightedBox(5, 3, 8,  100);

        System.out.println(weightedBox.volume());


        System.out.println("weightedBox.w = " + weightedBox.getW());
        printBoxInfo(box);
        printBoxInfo(weightedBox);

        Animal animal = new Animal("Dog");

        Cat boris = new Cat("Boris");

        Animal animalCatBoris = boris;

        makeSoundToAnimal(animal);

        makeSoundToAnimal(boris);
    }

    private static void makeSoundToAnimal(Animal animal) {
        animal.makeSound();
    }

    private static void printBoxInfo(Box box) {
        System.out.println("Box {" + box.getL() + "x" + box.getH() + "x" + box.getW() + "}");
    }
}
