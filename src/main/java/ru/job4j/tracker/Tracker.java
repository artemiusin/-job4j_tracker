package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] copy = new Item[100];
        Item[] rsl;
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                copy[size] = items[i];
                size++;
            }
        }
        rsl = Arrays.copyOf(copy, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl;
        Item[] copy = new Item[100];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                copy[size] = items[i];
                size++;
            }
        }
        rsl = Arrays.copyOf(copy, size);
        return rsl;
    }
}