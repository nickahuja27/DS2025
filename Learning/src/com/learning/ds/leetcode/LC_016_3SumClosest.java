package com.learning.ds.leetcode;

import java.util.Arrays;
//https://www.programcreek.com/2013/02/leetcode-3sum-closest-java/

public class LC_016_3SumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int result = find3SumClosest(nums, 1);
        System.out.println(result);
    }

    private static int find3SumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            int low = i;
            int high = nums.length - 1;

            while (low < high) {
                int tempSum = nums[i] + nums[low] + nums[high];
                int diff = Math.abs(tempSum - target);

                if(diff == 0) return 0;

                if(diff < min) {
                    min = diff;
                    result = diff;
                }

                if(tempSum <= target)
                    low++;
                else
                    high--;
            }
        }

        return result;
    }
}
