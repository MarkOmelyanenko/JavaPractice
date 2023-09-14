package com.company.Exception;

public class Exc2 {
    public static void main(String[] args) {
        try {
            int result = factorial(0);
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int factorial(int num) throws Exception {
        if (num < 1) throw new Exception("The number is less than 1");

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
