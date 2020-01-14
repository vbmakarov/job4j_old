package ru.job4j.calculator;

/**
 * Calculator - класс для вычисления арифметических операций
 *
 * @author Vitaly Makarov (vbmakarov.info@gmail.com)
 */

public class Calculator {

    /**
     * Метод add - сложение
     * @param first - первый аргумент
     * @param second - второй аргумент
     */

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Метод div - деление
     * @param first - первый аргумент
     * @param second - второй аргумент
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Метод multiply - умножение
     * @param first - первый аргумент
     * @param second - второй аргумент
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Метод subtract - вычитание
     * @param first - первый аргумент
     * @param second - второй аргумент
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main
     * @param args - аргументы
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
