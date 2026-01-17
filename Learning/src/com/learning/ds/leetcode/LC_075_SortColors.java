package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_075_SortColors {
    public static void main(String[] args) {
        int[] nums = {1,2,0,2,1,1,0,0,0,1,0,1,2,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid < end){
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, end);
                    end--;
            }

        }
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
