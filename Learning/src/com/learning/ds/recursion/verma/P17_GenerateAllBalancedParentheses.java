package com.learning.ds.recursion.verma;

public class P17_GenerateAllBalancedParentheses {
    public static void main(String[] args) {
        permutate("", 3, 3);
    }

    private static void permutate(String outSoFar, int openCounter, int closeCounter) {
        if(openCounter == 0 && closeCounter == 0) {
            System.out.println(outSoFar);
            return;
        }

        if(openCounter > 0) {
            permutate(outSoFar + '(', openCounter - 1, closeCounter);
        }

        if(closeCounter > 0 && closeCounter > openCounter) {
            permutate(outSoFar + ")", openCounter, closeCounter - 1);
        }
    }
}
