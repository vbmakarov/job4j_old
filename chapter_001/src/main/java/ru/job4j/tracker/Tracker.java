package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;


    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size=0;
        for (Item item : items) {
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsWithKey = new Item[items.length];
        int size=0;
        for (Item item : items) {
            if (item != null) {
                String name = item.getName();
                if (key.equals(name)) {
                    itemsWithKey[size] = item;
                    size++;
                }
            }
        }
        itemsWithKey = Arrays.copyOf(itemsWithKey, size);
        return itemsWithKey;
    }

    public Item findById(String id) {
        for (Item item : items) {
            String itemId = item.getId();
            if (id.equals(itemId)) {
                return item;
            }
        }
        return null;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        //Calendar calendar = Calendar.getInstance();
        //return Long.toString((int) ( Math.random() * 2 ) + calendar.getTimeInMillis());
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] getItems() {
        return items;
    }

}