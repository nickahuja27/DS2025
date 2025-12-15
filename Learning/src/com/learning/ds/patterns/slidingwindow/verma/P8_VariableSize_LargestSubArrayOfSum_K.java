package com.learning.ds.patterns.slidingwindow.verma;

public class P8_VariableSize_LargestSubArrayOfSum_K {
    public static void main(String[] args) {
        int[] inArray = {4, 1, 1, 1, 2, 3, 5};
        int sumToFind = 5;
        findLargest(inArray, sumToFind);
    }

    private static void findLargest(int[] inArray, int sumToFind) {
        int start = 0;
        int end = 0;
        int sumSoFar = 0;
        int maxLength = Integer.MIN_VALUE;

        while (end < inArray.length) {
            sumSoFar += inArray[end];

            if(sumSoFar > sumToFind) {
                while (start < end && sumSoFar > sumToFind) {
                    sumSoFar -= inArray[start];
                    start++;
                }
            }

            if(sumSoFar == sumToFind) {
                maxLength = Math.max(maxLength, (end - start + 1));
            }
            end++;
        }

        System.out.println("Max Sub Array length is: " + maxLength);
    }
}
