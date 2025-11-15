package com.learning.ds.backtracking.verma;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P9_LargestNumberInKSwaps {
    private static int largestNum;
    public static void main(String[] args) {
        String inNums = "7659";
        largestNum = Integer.parseInt(inNums);
        findLargest(inNums.toCharArray(), 2, 0);
        System.out.println(largestNum);
    }

    private static void findLargest(char[] inNums, int K, int index) {
        if(K == 0 || index == inNums.length) {
            if(largestNum < Integer.parseInt(new String(inNums))) {
                largestNum = Integer.parseInt(new String(inNums));
            }
            return;
        }
        char maxNum = (char)IntStream.range(index, inNums.length).map(i -> inNums[i])
                .max().orElse('0');

        for(int i = index; i < inNums.length; i++) {
            if(inNums[index] < inNums[i] && inNums[i] == maxNum) {
                System.out.println("Iteration:   " + Arrays.toString(inNums));
                swap(inNums, index, i);
                findLargest(inNums, K - 1, index + 1);
                swap(inNums, index, i);
            }
        }
    }

    private static void swap(char[] inChars, int index1, int index2) {
        char temp = inChars[index1];
        inChars[index1] = inChars[index2];
        inChars[index2] = temp;
    }
}
