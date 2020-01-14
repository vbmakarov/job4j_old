package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int pin = 4;
        int kin = 1;
        double expected = 1;
        double out = SqArea.square(pin, kin);
        Assert.assertEquals(expected, out, 0.01);
    }
}
