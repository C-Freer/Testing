package com.example;

public class Calculator {
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public double divide(double a, double b) {
         if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt.");
        }
        return a / b;
    }

}
