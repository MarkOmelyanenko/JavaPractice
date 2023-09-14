package com.company.OOP.enm;

public class EnumTask {
    public static void main(String[] args) {
        Day current = Day.WEDNESDAY;
        System.out.println(current);

        Meeting meeting = new Meeting("Family trip", Day.SUNDAY);
        meeting.printMeeting();
    }
}
