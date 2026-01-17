package com.learning.ds.leetcode;
import java.util.Arrays;

public class LC_031_NextPermutation {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 3, 2, 1};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void findNextPermutation(int[] nums) {
        int highPointer = 0;
        int nextHighPointer = 0;
        for(int i = nums.length - 1; i > 0; i--) {
            if(i > 0) {
                if (nums[i] < nums[i - 1]) {
                    highPointer = nums[i - 1];
                    nextHighPointer = nums[i];
                    break;
                }
            }
        }

        swap(nums, nextHighPointer, highPointer);
        reverse(nums, highPointer);
    }

    private static void reverse(int[] nums, int start) {
        int counter = 1;
        for(int i = start; i < (nums.length / 2) + 1; i++) {
            System.out.println(i);
            swap(nums, i, nums.length - counter++);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
