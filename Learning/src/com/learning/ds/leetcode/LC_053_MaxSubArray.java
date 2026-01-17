package com.learning.ds.leetcode;

public class LC_053_MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        findMaxSun(nums);
    }

    private static void findMaxSun(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxSoFar = 0;
        for(int i = 0; i < nums.length; i++) {
            maxSoFar += nums[i];
            maxSum = Math.max(maxSum, maxSoFar);
            if(maxSoFar < 0) {
                maxSoFar = 0;
            }
        }

        System.out.println(maxSum);
    }
}
