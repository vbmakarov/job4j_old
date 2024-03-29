package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z){
        this(x,y);
        this.z = z;
    }

    public double distance(Point b) {
        return sqrt(pow(this.x - b.x,2) + pow(this.y - b.y, 2));
    }

    public double distance3d(Point b) {
        return sqrt(pow(this.x - b.x,2) + pow(this.y - b.y, 2)+pow(this.z - b.z, 2));
    }
   /* public static void main(String[] args) {
        Point a=new Point(0,0);
        Point b=new Point(2,4);
        double dist=a.distance(b);
        System.out.println("result (0, 0) to (2, 4) " + dist);
    }*/
}