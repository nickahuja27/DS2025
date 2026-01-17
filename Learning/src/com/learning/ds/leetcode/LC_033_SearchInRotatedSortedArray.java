package com.learning.ds.leetcode;

public class LC_033_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,0,1,2};
        int pivot = findPivot(nums, 0, nums.length - 1);
        System.out.println(pivot);
    }

    private static int findPivot(int[] nums, int low, int high) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(nums[mid] > nums[mid + 1])
            return mid+1;

        if(nums[mid] > nums[low]) {
            return findPivot(nums, mid + 1, high);
        } else {
            return findPivot(nums, low, mid - 1);
        }
    }
}
