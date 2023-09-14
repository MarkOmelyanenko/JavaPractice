package com.company.OOP.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Book book = new Book("Java. Complete Referense", "H. Shildt");
        book.print();

        Printable printable1 = new Book("Head First Java", "K. Sierra");
        printable1.print();

        printable1 = new Journal("DOU News");
        printable1.print();

        Printable printable2 = new Journal("Forbes");
        printable2.print();

        String name2 = ((Journal)printable2).getTitle();
        System.out.println(name2);

        Printable.greetings();
    }
}
