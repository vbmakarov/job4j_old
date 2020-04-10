package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0,0);
        Point b = new Point (2,0);
        double out=a.distance(b);
        double expected=2.0;
        Assert.assertEquals(expected,out,0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0,0,9);
        Point b = new Point (2,0,10);
        double out=a.distance3d(b);
        double expected=2.23606797749979;
        Assert.assertEquals(expected,out,0.01);
    }
}
