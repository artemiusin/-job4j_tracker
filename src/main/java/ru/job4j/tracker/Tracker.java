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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int length = size - index - 1;
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }
}