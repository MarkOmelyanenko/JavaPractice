package com.company.OOP.constructors;

public class Constructors {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        Person person2 = new Person("Mario");
        person2.displayInfo();

        Person person3 = new Person("Luigi", 25);
        person3.displayInfo();
    }
}
