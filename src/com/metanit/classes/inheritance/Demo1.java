package com.metanit.classes.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(3,5,7,1);
        Rectangle rectangle = new Rectangle(2,3,2,3);
        Quadrate quadrate = new Quadrate(4,4,4,4);

        System.out.println("Периметр четырёхугольника = " + quadrilateral.perimeter());
        System.out.println("Периметр прямоугольника = " + rectangle.perimeter());
        System.out.println("Периметр квадрата = " + quadrate.perimeter());
        System.out.println();

        rectangle.square();
        quadrate.square();
    }
}
