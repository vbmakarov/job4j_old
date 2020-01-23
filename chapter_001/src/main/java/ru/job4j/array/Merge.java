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
                }else if(left[onePt]<=right[twoPt] && onePt<left.length){
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
        /*if(left.length==0) {
            for (int j = 0; j < right.length; j++) {
                rsl[i] = right[j];
                i++;
            }
        }else if(right.length==0) {
            for (int j = 0; j < left.length; j++) {
                rsl[j] = left[j];
                i++;
            }
        } else if (left[i] < right[i]) {
            for (int j = 0; j < left.length; j++) {
                rsl[j] = left[j];
                i++;
            }
            for(int j=0;j<right.length;j++){
                rsl[i]=right[j];
                i++;
            }

        } else if(left[i] > right[i]) {
            for (int j = 0; j < right.length; j++) {
                rsl[j] = right[j];
                i++;
            }
            for(int j=0;j<left.length;j++){
                rsl[i]=left[j];
                i++;
            }
        }
            return rsl;

    }*/

         /*while (i < right.length) {
                if (left[i] < right[i]) {
                    rsl[i] = left[i];
                    i++;
                }
                int j = 0;
                while (j < left.length) {
                    if (left[i] <= right[j]) {
                        rsl[i] = left[i];
                        i++;
                    }
                }
                for(;i < rsl.length;){
                    for(int z=0; z<right.length;z++){
                        if(right[z]>rsl[i]){
                            rsl[i]=right[z];
                            z++;
                            i++;
                        }
                    }
                }
            }*/


