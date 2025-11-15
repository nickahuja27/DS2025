package com.learning.ds.backtracking.verma;

import java.util.Arrays;

public class P8_PermutationsOfAString {
    public static void main(String[] args) {
        String inString = "abc";
        permutate(inString.toCharArray(), 0);
    }

    private static void permutate(char[] inChars, int index) {
        if(index == inChars.length) {
            String solution = Arrays.toString(inChars);
            System.out.println(solution);
            return;
        }

        for(int i = index; i < inChars.length; i++) {
            swap(inChars, index, i);
            permutate(inChars, index + 1);
            swap(inChars, index, i);
        }
    }

    private static void swap(char[] inChars, int index1, int index2) {
        char temp = inChars[index1];
        inChars[index1] = inChars[index2];
        inChars[index2] = temp;
    }
}
