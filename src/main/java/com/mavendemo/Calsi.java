package com.mavendemo;


public class Calsi {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(int firstNumber, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return (double) firstNumber / divisor;
    }

}

