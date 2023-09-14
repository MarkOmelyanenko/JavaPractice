package com.company.Exception;

public class Exc1 {
    public static void main(String[] args) {
        try {
            int a = 27;
            if (a != 15) {
                throw new Exception("Variable must be equal 27");
            }
            int[] numbers = new int[3];
            numbers[4] = 45;
            numbers[3] = Integer.parseInt("zxc");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds");
        } catch (NumberFormatException ex) {
            System.out.println("Error converting from string to number");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Exit");
        }
    }
}
