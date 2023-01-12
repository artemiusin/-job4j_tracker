package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String TOMATO = "Tomato";

    @Override
    public String name() {
        return super.name() + TOMATO;
    }
}
