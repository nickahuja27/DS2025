package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

/*
Find the 3 numbers whose sum is 0
Do not return DUPLICATE triplets.
a + b + c = 0
b + c = -a
 */
public class P2_LC_ThreeSum {
    public static void main(String[] args) {
        int[] inArray = {-1, 0, 1, 2, -1, -4};
        // Sort so that we can use 2 pointer approach
        Arrays.sort(inArray);
        System.out.println(Arrays.toString(inArray) + "\n\n");
        find(inArray);
    }

    private static void find(int[] inArray) {
        for(int i = 0; i < inArray.length; i++) {
            int left = i + 1;
            int right = inArray.length - 1;
            while (left < right) {
                int workingSum = inArray[left] + inArray[right];
                if(workingSum == -inArray[i]) {
                    System.out.println("Set is {" + inArray[i] + ", " + inArray[left] + ", " + inArray[right] + "}");
                    break;
                } else if (workingSum > -inArray[i]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
    }
}
