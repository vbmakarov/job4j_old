package ru.job4j.condition;

public class Max {
    /*public static int max(int left, int right) {

        return left > right ? left : right;
    }*/

    public int add(int first, int second) {
        return Math.max(first, second);
    }

    public int add(int first, int second, int three) {
        int tmp1 = add(first, second);
        return add(tmp1, three);
    }

    public int add(int first, int second, int three, int four) {
        int tmp1 = add(first, second);
        int tmp2 = add(three, four);
        return add(tmp1, tmp2);
    }

}
