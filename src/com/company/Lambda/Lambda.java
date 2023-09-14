package com.company.Lambda;

public class Lambda {
    public static void main(String[] args) {
        Operationable operation1 = (x, y) -> x + y;
        Operationable operation2 = (int x, int y) -> {
            if (y > 10) return x / y;
            else return x * y;
        };

        System.out.println(operation1.calculate(3, 12));
        System.out.println(operation2.calculate(100, 9));

        Printable printer = s -> System.out.println(s);
        printer.print("Hello");
    }
}
