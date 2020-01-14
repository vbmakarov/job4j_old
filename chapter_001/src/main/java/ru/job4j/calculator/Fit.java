package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {

    double manWeight = manWeight(170);
    double womanWeight = womanWeight(170);

    System.out.println("Ideal weight for man with a height of 170 cm - " + manWeight + " kg");
    System.out.println("Ideal weight for women with a height of 170 cm  - " + womanWeight + " kg");
    }
}
