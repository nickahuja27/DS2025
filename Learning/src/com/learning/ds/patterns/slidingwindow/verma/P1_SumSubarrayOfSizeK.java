package com.learning.ds.patterns.slidingwindow.verma;

public class P1_SumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] inArray = {2,3,5,2,9,7,1};
        findSum(inArray, 3);
    }

    private static void findSum(int[] inArray, int K) {
        int start = 0;
        int end = 0;
        int sumSoFar = 0;
        while (end < inArray.length) {
            sumSoFar += inArray[end];
            if(end - start + 1 < K)
                end++;
            else {
                System.out.print(" " + sumSoFar);
                sumSoFar -= inArray[start];
                start++;
                end++;
            }
        }
    }
}
