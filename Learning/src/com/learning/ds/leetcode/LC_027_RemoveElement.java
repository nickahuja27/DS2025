package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_027_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElements(nums, 2);
    }

    private static void removeElements(int[] nums, int target) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != target)
                nums[counter++] = nums[i];
        }

        for(int i = counter; i < nums.length; i++) {
            nums[i] = -1;
        }

        System.out.println(Arrays.toString(nums));
    }
}
