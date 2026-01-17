package com.learning.ds.leetcode;

// https://goodtecher.com/leetcode-35-search-insert-position/
public class LC_035_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,8,9};
        int position = findPosition(nums, 0, nums.length - 1, 7);
        System.out.println(position);
    }

    private static int findPosition(int[] nums, int low, int high, int target) {
        if(low > high)
            return -1;

        if(target < nums[low])
            return low;
        if(target > nums[high])
            return high + 1;

        int mid = (low + high) / 2;

        if(nums[mid] == target)
            return mid;
        if(nums[mid] < target && nums[mid + 1] > target)
            return mid + 1;

        if(nums[mid] < target) {
            return findPosition(nums, mid + 1, high, target);
        } else {
            return findPosition(nums, low, mid - 1, target);
        }
    }
}
