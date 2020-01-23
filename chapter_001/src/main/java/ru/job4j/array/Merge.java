package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int onePt = 0;
        int twoPt = 0;
        int res = 0;
        if (left.length == 0) {
            while (onePt< right.length) {
                rsl[onePt] = right[onePt];
                onePt++;
            }
        } else if (right.length == 0) {
            while (twoPt < left.length) {
                rsl[twoPt] = left[twoPt];
                twoPt++;
            }
        } else {
            while(res<rsl.length){
                if(onePt==left.length){
                    rsl[res]=right[twoPt];
                    res++;
                    twoPt++;
                }else if(twoPt==right.length){
                    rsl[res]=left[onePt];
                    res++;
                    onePt++;
                }else if(left[onePt]<=right[twoPt]){
                    rsl[res]=left[onePt];
                    onePt++;
                    res++;
                }else if(left[onePt]>right[twoPt]){
                    rsl[res]=right[twoPt];
                    twoPt++;
                    res++;
                }
            }
        }
        return rsl;
    }

        public static void main (String[]args) {
            Merge process = new Merge();
            int[] rsl = process.merge(
                    new int[]{1, 3, 5},
                    new int[]{2, 4}
            );
            System.out.println(Arrays.toString(rsl));
        }
    }


