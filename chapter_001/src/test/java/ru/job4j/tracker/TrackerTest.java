package ru.job4j.tracker;

import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void WhenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item);
        tracker.add(item2);
        Item[] resultArrayObjects = tracker.findAll();
        int expect=2;
        assertThat(resultArrayObjects.length,is(expect));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item[] result=tracker.findByName("test1");
        assertEquals(result[0].getName(),item.getName());
    }

}