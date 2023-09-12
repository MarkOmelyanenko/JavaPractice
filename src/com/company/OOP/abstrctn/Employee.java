package com.company.OOP.abstrctn;


public class Employee extends Person {
    private String bank;

    public Employee(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    public void display() {
        System.out.printf("Employee %s from %s \n", super.getName(), bank);
    }
}
