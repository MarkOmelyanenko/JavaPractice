package com.company.OOP.static_modifier.variable;

public class Person {

    private int id;
    static int counter = 1;

    Person() {
        id = counter++;
    }

    public void dispayId() {
        System.out.printf("Id: %d \n", id);
    }
}
