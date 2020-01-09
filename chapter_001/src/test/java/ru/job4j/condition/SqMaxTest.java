package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void isMax() {
        assertThat(
                SqMax.max(1,10,5,9),
                is(10)
        );
    }

}