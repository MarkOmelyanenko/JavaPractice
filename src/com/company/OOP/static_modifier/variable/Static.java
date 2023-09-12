package com.company.OOP.static_modifier.variable;

public class Static {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.dispayId();
        person2.dispayId();

        Person.counter = 8;

        Person person3 = new Person();
        person3.dispayId();
    }
}
