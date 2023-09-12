package com.company.OOP.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Person person1 = new Person("Mikel");
        person1.display();
        person1.chill();

        Employee person2 = new Employee("Trevor", "Microsoft");
        person2.display();

        Employee person3 = new Employee("Franklin", "Google");
        person3.display();

        Person person4 = new Employee("Marchello", "Galley");
        person4.display();
    }
}
