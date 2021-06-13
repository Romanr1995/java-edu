package com.metanit.classes.interfaces;

public class Point implements Comparable<Point> {
    private double x;

    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * сортировать по возрастанию расстояния от центра координат
     * если у двух точек расстояние одинаковое, то раньше (левее) идет точка с наибольшим значением у
     * если у тоже совпадают,то раньше идет точка с наибольшим х
     */
    @Override
    public int compareTo(Point o) {
        return 0;
    }


}
