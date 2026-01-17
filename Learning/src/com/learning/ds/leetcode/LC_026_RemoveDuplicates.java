package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_026_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,3,3,4,4,5};
        removeDuplicates(nums);
    }

    private static void removeDuplicates(int nums[]) {
        int counter = 0;

        for(int findCounter = 1; findCounter < nums.length; findCounter++) {
            if(nums[findCounter] == nums[findCounter - 1])
                continue;
            nums[++counter] = nums[findCounter];
        }

        for(int i = counter + 1; i < nums.length; i++) {
            nums[i] = -1;
        }

        System.out.println(Arrays.toString(nums));
    }
}
