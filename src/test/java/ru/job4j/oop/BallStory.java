package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        hare.tryEat(ball);
        ball.tryRun(false);
        wolf.tryEat(ball);
        ball.tryRun(false);
        fox.tryEat(ball);
        ball.tryRun(true);
    }
}
