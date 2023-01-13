package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 1000);
        Book book2 = new Book("Code", 500);
        Book book3 = new Book("Clean", 200);
        Book book4 = new Book("Java", 10000);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + books[i].getName() + " pages " + books[i].getPages());
        }
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + books[i].getName() + " pages " + books[i].getPages());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Book " + books[i].getName() + " pages " + books[i].getPages());
            }
        }
    }
}
