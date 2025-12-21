package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

public class P3_LC_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // given that the array is sorted otherwise SORT.
        int[] inArray = {0, 0, 1, 1, 1, 2, 2};
        findIndex(inArray);
        System.out.println(Arrays.toString(inArray));
    }

    private static void findIndex(int[] inArray) {
        int slow = 0;
        int fast = 0;
        while (fast < inArray.length) {
            if(inArray[slow] != inArray[fast]){
                slow++;
                inArray[slow] = inArray[fast];
            }
            fast++;
        }
    }
}
