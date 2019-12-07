package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result2 = distance(5, 0, 2, 4);
        double result3 = distance(4, 9, 3, 5);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (5, 0) to (2, 4) " + result2);
        System.out.println("result (4, 9) to (3, 5) " + result3);
    }
}