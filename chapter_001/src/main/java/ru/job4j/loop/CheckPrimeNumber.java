package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if(number==2){
            return true;
        }else if ((number<=1)||(number % 2 == 0) || (number > 3 && number % 3 == 0)) {
            return false;
        } else {
            return true;
        }

    }
}
