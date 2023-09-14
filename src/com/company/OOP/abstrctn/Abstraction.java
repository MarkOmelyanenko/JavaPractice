package com.company.OOP.abstrctn;

public class Abstraction {
    public static void main(String[] args) {
        Employee employee = new Employee("Sam", "Monobank");
        employee.display();

        Client client = new Client("Bob");
        client.display();
    }
}
