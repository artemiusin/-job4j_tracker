package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String eat) {
        this.food = eat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        System.out.println("There are black's food.");
        black.eat("fish");
        black.show();
    }
}
