package com.company.OOP.object;

public class PersonWithOver {

    private String name;

    public PersonWithOver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }
}
