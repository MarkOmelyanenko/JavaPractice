package com.company.OOP.encapsulation.modifiers;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Viktoria", 18, "London", "+954894585");

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);
//        System.out.println(person.phone);             private!

        System.out.println();

        person.displayName();
        person.displayAge();
        person.displayAddress();
//        person.displayPhone();             private!
    }
}
