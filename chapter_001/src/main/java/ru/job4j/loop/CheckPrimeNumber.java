package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrimeNumber=true;
        if (number == 2) {
            return isPrimeNumber;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) isPrimeNumber = false;
        }
        return isPrimeNumber;
    }
}
