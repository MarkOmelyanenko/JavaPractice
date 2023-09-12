package com.company.OOP.encapsulation.getters_setters;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Mike", 20);

        System.out.println(person.getName() + " " + person.getAge());

        person.setName("Nigel");
        person.setAge(18);

        System.out.println(person.getName() + " " + person.getAge());
    }
}
