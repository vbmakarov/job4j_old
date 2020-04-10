package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max m = new Max();
        int result = m.add(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxOf3Number() {
        Max m = new Max();
        int result = m.add(1, 2,8);
        assertThat(result, is(8));
    }
    @Test
    public void whenMaxOf4Number() {
        Max m = new Max();
        int result = m.add(1, 9,5,4);
        assertThat(result, is(9));
    }
}