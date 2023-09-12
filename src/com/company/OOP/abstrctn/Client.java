package com.company.OOP.abstrctn;

public class Client extends Person {
    public Client(String name) {
        super(name);
    }

    public void display() {
        System.out.printf("Client %s \n", super.getName());
    }
}
