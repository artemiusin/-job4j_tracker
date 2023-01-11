package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int rsl = sum(10);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        rsl = calculator.multiply(5);
        System.out.println(rsl);
        rsl = minus(10);
        System.out.println(rsl);
        rsl = calculator.divide(10);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(10);
        System.out.println(rsl);
    }
}

