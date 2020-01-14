package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;

        // вычисляем сумму которую нам нужно выплатить с учеттом проценной ставки
        double credit = amount + amount * (percent / 100);

        //остаток по кредиту с учетом процентной ставки
        double balance;

        do {
            balance = credit - salary;
            credit = balance * (percent / 100) + balance;
            year++;
        }
        while (credit > 0);
        return year;
    }
}