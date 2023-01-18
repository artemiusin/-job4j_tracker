package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("passengers");
    }

    @Override
    public int refuel(int quantity) {
        int PRICE = 100;
        return PRICE;
    }
}
