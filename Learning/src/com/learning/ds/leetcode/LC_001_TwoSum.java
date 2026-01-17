package com.learning.ds.leetcode;

public class LC_001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,7,9,11,12,13,14,15};
        int target = 9;

        for(int i = 0; i < nums.length; i++) {
            int index = find(nums, 0, nums.length - 1, target - nums[i]);
            if(index != -1) {
                System.out.println(i);
                System.out.println(index);
            }
        }
    }

    private static int find(int[] nums, int low, int high, int numToFind) {
        if(high < low)
            return -1;
        int mid = (low + high) / 2;

        if(nums[mid] == numToFind) {
            return mid;
        } else if(numToFind <= nums[mid]) {
            find(nums, low, mid - 1, numToFind);
        } else {
            find(nums, mid + 1, high, numToFind);
        }
        return -1;
    }
}
