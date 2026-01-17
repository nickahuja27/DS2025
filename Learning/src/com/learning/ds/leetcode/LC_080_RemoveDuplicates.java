package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_080_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int length = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(length);
    }

    private static int removeDuplicates(int[] nums) {
        int counter = 1;
        int position = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                counter++;
            } else {
                counter = 1;
            }

            if(counter > 2) {
                continue;
            } else {
                nums[++position] = nums[i];
            }
        }

        for(int i = position + 1; i < nums.length; i++) {
            nums[i] = -1;
        }

        return position + 1;
    }
}
