package ru.job4j.condition;

public class Max {
    /*public static int max(int left, int right) {

        return left > right ? left : right;
    }*/

    public int MaxNumber(int first, int second) {
        return Math.max(first, second);
    }

    public int MaxNumber(int first, int second, int three) {
        int tmp1 = MaxNumber(first, second);
        return MaxNumber(tmp1, three);
    }

    public int MaxNumber(int first, int second, int three, int four) {
        int tmp1 = MaxNumber(first, second);
        int tmp2 = MaxNumber(three, four);
        return MaxNumber(tmp1, tmp2);
    }

}
