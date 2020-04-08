package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap=new Point(0,0);
        Point bp=new Point(0,2);
        Point cp=new Point(2,4);
        Triangle tr = new Triangle(ap,bp,cp);
        double result = tr.area();
        assertEquals(result,1.9999999999999984,0.001);
    }

    @Test
    public void whenNotExist() {
        Point ap=new Point(0,0);
        Point bp=new Point(0,2);
        Point cp=new Point(0,4);
        Triangle tr = new Triangle(ap,bp,cp);
        double result = tr.area();
        assertEquals(result,-1,0.001);
    }
}