package com.company.OOP.inheritance;

import com.company.OOP.inheritance.Person;

public class Employee extends Person {
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%s works in %s \n", name, company);
    }
}
