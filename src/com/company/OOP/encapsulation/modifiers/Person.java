package com.company.OOP.encapsulation.modifiers;

public class Person {
    public String name;
    int age;
    protected String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.println(name);
    }

    void displayAge() {
        System.out.println(age);
    }

    protected void displayAddress() {
        System.out.println(address);
    }

    private void displayPhone() {
        System.out.println(phone);
    }

}
