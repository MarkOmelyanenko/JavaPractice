package com.company.OOP.polymorphism;

public class Journal implements Printable {

    private String title;

    String getTitle() {
        return title;
    }

    public Journal(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title);
    }
}
