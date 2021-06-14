package com.metanit.classes.interfaces;
import static java.lang.Math.sqrt;

public class Point implements Comparable<Point> {
    private double x;

    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToTheCentr() {
        return sqrt(this.x * this.x + this.y * this.y);
    }

    /**
     * сортировать по возрастанию расстояния от центра координат
     * если у двух точек расстояние одинаковое, то раньше (левее) идет точка с наибольшим значением у
     * если у тоже совпадают,то раньше идет точка с наибольшим х
     */
    @Override
    public int compareTo(Point o) {
        if (this.distanceToTheCentr() == o.distanceToTheCentr() && this.y != o.y) {
            if (this.y > o.y) {
                return -1;
            } else if (this.y < o.y) {
                return 1;
            } else {
                return 0;
            }
        } else if (this.distanceToTheCentr() == o.distanceToTheCentr() && this.y == o.y) {
            if (this.x > o.x) {
                return -1;
            } else if (this.x < o.x) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (this.distanceToTheCentr() > o.distanceToTheCentr()) {
                return -1;
            } else if (this.distanceToTheCentr() < o.distanceToTheCentr()) {
                return 1;
            }
        }
        return 0;
    }


}
