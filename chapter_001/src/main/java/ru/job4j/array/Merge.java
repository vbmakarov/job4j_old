package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int onePt = 0;
        int twoPt = 0;
            while(onePt+twoPt<rsl.length){
                if(twoPt==right.length){
                    rsl[onePt+twoPt]=left[onePt];
                    onePt++;
                }else if(onePt==left.length){
                    rsl[onePt+twoPt]=right[twoPt];
                    twoPt++;
                } else if(left[onePt]<=right[twoPt]){
                    rsl[onePt+twoPt]=left[onePt];
                    onePt++;
                }else if(left[onePt]>right[twoPt]){
                    rsl[onePt+twoPt]=right[twoPt];
                    twoPt++;
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
