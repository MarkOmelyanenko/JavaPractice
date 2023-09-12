package com.company.OOP.inheritance;

public class Person {

    String name;
    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public final void chill() {
        System.out.printf("Person %s is chilling now \n", name);
    }
}
