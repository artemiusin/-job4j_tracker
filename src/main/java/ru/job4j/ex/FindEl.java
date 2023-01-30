package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            } else {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"one","two","three"};
        try {
            indexOf(array, "five");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
