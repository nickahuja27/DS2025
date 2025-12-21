package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

public class P1_LC_TwoSum {
    public static void main(String[] args) {
        // The input Array has to be sorted. If not, sort it
        // Arrays.sort(inArray);
        int[] inArray = {2, 3, 4, 5, 8, 11, 18};
        find(inArray, 8);
    }

    private static void find(int[] inArray, int target) {
        int left = 0;
        int right = inArray.length - 1;

        while (left < right) {
            int workingSum = inArray[left] + inArray[right];
            if(workingSum == target) {
                System.out.println("Indices are Left: " + left + ", Right: " + right);
                break;
            } else if (workingSum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
