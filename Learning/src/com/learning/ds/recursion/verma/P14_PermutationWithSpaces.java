package com.learning.ds.recursion.verma;

public class P14_PermutationWithSpaces {
    public static void main(String[] args) {
        permutate("ABC", "A", 1);
    }

    private static void permutate(String inString, String outSoFar, int index) {
        if(index >= inString.length()) {
            System.out.println(outSoFar);
            return;
        }
        permutate(inString, outSoFar + "_" + inString.charAt(index), index + 1);
        permutate(inString, outSoFar + inString.charAt(index), index + 1);
    }
}
