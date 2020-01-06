package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void WhenAllTrue(){
        Check check=new Check();
        boolean[] data=new boolean[]{true,true,true,true};
        boolean result=check.mono(data);
        boolean expect=true;
        assertThat(result,is(expect));
    }

    @Test
    public void WhenNotAllTrue(){
        Check check=new Check();
        boolean[] data=new boolean[]{true,false,true,true};
        boolean result=check.mono(data);
        boolean expect=false;
        assertThat(result,is(expect));
    }
    @Test
    public void WhenNotAllTrue2(){
        Check check=new Check();
        boolean[] data=new boolean[]{true,false,true,true,false,true,true};
        boolean result=check.mono(data);
        boolean expect=false;
        assertThat(result,is(expect));
    }
}