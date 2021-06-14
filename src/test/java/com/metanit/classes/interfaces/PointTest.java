package com.metanit.classes.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void testCompareTwoPointsWithDifferenceCoordinate() {
        Point t1 = new Point(4,5);
        Point t2 = new Point(3,2);

        assert t1.compareTo(t2) < 0;
    }

    @Test
    public void testWithTheSameValuesDistance() {
        Point t1 = new Point(4,5);
        Point t2 = new Point(5,4);

        assert t1.compareTo(t2) < 0;
        assert t2.compareTo(t1) > 0;
    }

    @Test
    public void testWithTheSameValuesDistanceAndSameY() {
        Point t1 = new Point(-4, 5);
        Point t2 = new Point(4, 5);

        assert t1.compareTo(t2) > 0;
    }

    @Test
    public void testCompletelyIdentical() {
        Point t1 = new Point(4, 5);
        Point t2 = new Point(4, 5);

        assert t1.compareTo(t2) == 0;
    }

    @Test
    public void testWithTheSameValuesDistanceAndSameX() {
        Point t1 = new Point(4, -5);
        Point t2 = new Point(4, 5);

        assert t1.compareTo(t2) > 0;
    }

    @Test
    public void testAllValuesAreZero() {
        Point t1 = new Point(0, 0);
        Point t2 = new Point(0, 0);

        assert t1.compareTo(t2) == 0;
    }
}