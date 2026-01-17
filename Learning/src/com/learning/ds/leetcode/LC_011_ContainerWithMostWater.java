package com.learning.ds.leetcode;

public class LC_011_ContainerWithMostWater {
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int maxCapacity = maxCapacity(heights);
        System.out.println(maxCapacity);
    }

    private static int maxCapacity(int[] heights) {
        int low = 0;
        int high = heights.length - 1;
        int maxCapacity = Integer.MIN_VALUE;
        while (low < high) {
            int capacity = (high - low) * Math.min(heights[high] , heights[low]);
            maxCapacity = Math.max(capacity, maxCapacity);
            if(heights[low] < heights[high])
                low++;
            else
                high--;
        }

        return maxCapacity;
    }
}
