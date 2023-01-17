package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + " enter 1 to 3");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3 && count >= matches) {
                count -= matches;
                turn = !turn;
                System.out.println("count = " + count);
            } else {
                System.out.println("Error");
            }
        }
        if (!turn) {
            System.out.println("first wins");
        } else {
            System.out.println("second wins");
        }
    }
}
