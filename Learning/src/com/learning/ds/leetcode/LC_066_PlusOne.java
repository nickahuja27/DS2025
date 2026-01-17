package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_066_PlusOne {
    public static void main(String[] args) {
        int nums[] = {9,9,9};
        nums = addOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] addOne(int[] nums) {
        int carryOver = 1;
        for(int i = nums.length - 1; i >=0; i--) {
            int tempNum = carryOver + nums[i];
            carryOver = tempNum / 10;
            nums[i] = tempNum % 10;
        }

        if(carryOver > 0) {
            int[] newNums = new int[nums.length + 1];
            newNums[0] = carryOver;
            for(int i = 1; i < newNums.length; i++) {
                newNums[i] = nums[i-1];
            }
            nums = newNums;
        }

        return nums;
    }
}
