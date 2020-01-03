package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int i=1;i<array.length-1;i++) {
            int tmp=array[array.length-i];
            array[array.length-i]=array[i-1];
            array[i-1]=tmp;
        }
        return array;
    }
}