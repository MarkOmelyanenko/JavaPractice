package com.company.OOP.static_modifier.method;

public class Static {
    public static void main(String[] args) {
        Person.displayCounter();

        Person person1 = new Person();
        Person person2 = new Person();

        Person.displayCounter();

        person1.displayId();
        person2.displayId();
    }
}
