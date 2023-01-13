package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFcs("Artem Ysin");
        student.setGroup("1-Java");
        student.setEnter(new Date());

        System.out.println("student:  " + student.getFcs() + " group: " + student.getGroup()
                + "enter date: " + student.getEnter());
    }
}
