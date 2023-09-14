package com.company.OOP.enm;

public enum Color {
    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

    private String code;

    Color(String code) { // private
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
