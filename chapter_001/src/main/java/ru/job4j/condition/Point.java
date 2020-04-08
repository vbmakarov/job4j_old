package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return sqrt(pow(this.x - b.x,2) + pow(this.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point a=new Point(0,0);
        Point b=new Point(2,0);
        double dist=a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + dist);
    }
}