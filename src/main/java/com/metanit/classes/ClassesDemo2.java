package com.metanit.classes;
import static java.lang.Math.sqrt;

public class ClassesDemo2 {
    public static void main(String[] args) {
        Circle circle = new Circle(4.1);

        Point pointx = new Point(4,6);
        Point pointy = new Point(3,8);
        Point pointz = new Point(2,9);


        double square = square((int) circle.getR());

        double side12 = side((int) pointx.getX(),(int) pointx.getY(),(int) pointy.getX(),(int) pointy.getY());
        double side23 = side((int) pointy.getX(),(int) pointy.getY(),(int) pointz.getX(),(int) pointz.getY());
        double side13 = side((int) pointx.getX(),(int) pointx.getY(),(int) pointz.getX(),(int) pointz.getY());


        Triangle t1 = new Triangle(pointx, pointy, pointz);

        Triangle t2 = new Triangle(3.0, 4.0, 5.0);

        System.out.println("pointx.distanceTo(pointy) = " + pointx.distanceTo(pointy));

        System.out.println("side12 = " + side12);
        System.out.println("side23 = " + side23);
        System.out.println("side13 = " + side13);


        System.out.println("square = " + square);
        System.out.println("circle.square() = " + circle.square());

        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(0.5);

        System.out.println("c1.square() = " + c1.square());
        System.out.println("c2.square() = " + c2.square());

        printInfo(circle);

        Circle cIncorrect = new Circle(0.0);

        System.out.println("before first incorrect printInfo");
        printInfo(cIncorrect);

        System.out.println("before second incorrect printInfo");
        printInfo(cIncorrect);
    }

    public static void printInfo(Circle c) {
        if (c.getR() > 0) {
            System.out.println("Circle { r = " + c.getR() + " , square = " + c.square() +
                    " , circumference = " + c.circumference() + " }");
        }
    }

    public static double square(int r) {
        return Math.PI * r * r;
    }

    public static double side(int x1,int y1,int x2,int y2) {
        return sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
