package com.company.OOP.polymorphism;

public interface Printable {

    int OPEN = 1; // public static final
    int CLOSE = 0; // public static final

    void print();

    static void greetings() {
        System.out.println("Hello!");
    }
}
