package sef.FinalTasks.Calctest;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("We dont devide by 0 didnt you know that ?");
        }
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}