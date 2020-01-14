package ru.job4j.converter;

public class Converter {

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {

        return value * 70;
    }

    public static int dollarToRuble(int value) {

        return value * 70;
    }


    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int expected = 2;
        boolean passed = expected == euro;

        int dollar = rubleToDollar(140);
        int expected2 = 2;
        boolean passed2 = expected2 == dollar;

        int dollarRub = dollarToRuble(dollar);
        int expected3 = 140;
        boolean passed3 = expected3 == dollarRub;

        int euroRub = euroToRuble(euro);
        int expected4 = 140;
        boolean passed4 = expected4 == euroRub;

        System.out.println("140 rubles are " + euro + " euro. Test result : " + passed);
        System.out.println("140 rubles are " + dollar + " dollar. Test result : " + passed2);
        System.out.println(dollar + " dollars are " + dollarRub + " ruble. Test result : " + passed3);
        System.out.println(euro + " euro are " + euroRub + " ruble. Test result : " + passed4);

    }
}
