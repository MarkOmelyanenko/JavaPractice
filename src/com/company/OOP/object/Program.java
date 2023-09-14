package com.company.OOP.object;

public class Program {
    public static void main(String[] args) {
        PersonWithoutOver person1 = new PersonWithoutOver("Mario");
        System.out.println(person1.toString()); // get a representation of an object as a string

        PersonWithOver person2 = new PersonWithOver("Jerome");
        System.out.println(person2.toString());

        PersonWithoutOver person3 = new PersonWithoutOver("Max");
        System.out.println(person3.hashCode()); // objects hash code

        PersonWithoutOver person4 = new PersonWithoutOver("Leon");
        System.out.println(person4.getClass());

        PersonWithoutOver person5 = new PersonWithoutOver("Leon");
        PersonWithoutOver person6 = new PersonWithoutOver("Jerome");
        System.out.println(person4.equals(person5));
        System.out.println(person4.equals(person3));
        System.out.println(person6.equals(person2));
    }
}
