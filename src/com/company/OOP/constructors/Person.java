package com.company.OOP.constructors;

public class Person {
    String name;
    int age;

    public Person() {
        this("null", 0);
    }

    public Person(String name) {
        this(name, 18);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
