package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    @Test
    public void Test1(){
        Sort srt=new Sort();
        int[] arr=new int[] {8,0,11,8,10,15,1};
        int[] result=srt.sortArr(arr);
        int[] expect=new int[]{0,1,8,8,10,11,15};
        assertThat(result, is(expect));
    }

    @Test
    public void Test2(){
        Sort srt=new Sort();
        int[] arr=new int[] {0};
        int[] result=srt.sortArr(arr);
        int[] expect=new int[]{0};
        assertThat(result, is(expect));
    }

    @Test
    public void Test3(){
        Sort srt=new Sort();
        int[] arr=new int[] {0,1,2,3};
        boolean result=srt.sortArr2(arr);
        boolean expect=true;
        assertThat(result, is(expect));
    }

}