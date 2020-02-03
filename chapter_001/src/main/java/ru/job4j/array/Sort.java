package ru.job4j.array;

import java.util.Arrays;

public class Sort {

    public int[] sortin(int[] args){
        int tmp;
        for(int i=0;i<args.length-1;i++){
            for(int j=i;j<args.length;j++){
                if(args[i]>args[j]){
                   tmp=args[i];
                   args[i]=args[j];
                   args[j]=tmp;
                }
            }
        }
        return args;
    }

}
