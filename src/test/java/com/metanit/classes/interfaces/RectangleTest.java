package com.metanit.classes.interfaces;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testDifferentSquare() {
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(2,3);

        assert r1.compareTo(r2) > 0;
        assert r1.compareTo(r2) * r2.compareTo(r1) < 0;
    }

    @Test
    public void testTheSquareAreEqualTo() {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(1,6);

        assert r1.compareTo(r2) < 0;
    }

    @Test
    public void testTheSquareAndPerimetrsAreEqualTo() {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(3,2);

        assert r1.compareTo(r2) == 0;
    }

    @Test
    public void testNegativeValues() {
        Rectangle r1 = new Rectangle(2,-3);
        Rectangle r2 = new Rectangle(-3,-2);

        assert r1.compareTo(r2) == 0;
    }
}
