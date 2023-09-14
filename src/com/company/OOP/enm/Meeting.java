package com.company.OOP.enm;

public class Meeting {
    String name;
    Day day;

    public Meeting(String name, Day day) {
        this.name = name;
        this.day = day;
    }

    public void printMeeting() {
//        System.out.println("Your " + name + " is on " + day);
        System.out.printf("Your %s is on %s \n", name, day);
    }
}
