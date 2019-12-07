package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1in=0;
        int y1in=0;
        int x2in=2;
        int y2in=0;
        double expected=2.0;
        double out=Point.distance(x1in,y1in,x2in,y2in);
        Assert.assertEquals(expected,out,0.01);
    }
}
