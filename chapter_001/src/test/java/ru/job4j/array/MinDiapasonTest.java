package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void testDiapasonMin(){
        int[] data=new int[]{5,8,9,1,0,78,35,11};
        int result=MinDiapason.findMin(data,0,data.length);
        int expect=0;
        assertThat(result,is(expect));
    }

}