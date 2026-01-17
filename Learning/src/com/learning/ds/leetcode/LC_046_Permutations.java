package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_046_Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutate(nums, 0);
    }

    private static void permutate(int[] nums, int index) {
        if(index == nums.length - 1) {
            System.out.println(Arrays.toString(nums));
        }

        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutate(nums, index + 1);
            swap(nums, i, index);
        }
    }

    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
