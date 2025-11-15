package com.learning.ds.recursion.verma;

public class Factorial {
    public static void main(String[] args) {
        int fact = print(5);
        System.out.printf("Factorial is: " + fact);
    }

    private static int print(int num) {
        if(num <= 1)
            return 1;
        return num * print(num - 1);
    }
}
