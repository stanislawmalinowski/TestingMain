package com.kodilla;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);
        if (result == a + b) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Failed");
        }

        result = calculator.subtract(a, b);
        if (result == a - b) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Failed");
        }
    }
}