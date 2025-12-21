package com.learning.ds.patterns.twopointer;

public class P6_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] inArray = {1,8,6,2,5,4,8,3,7};
        find(inArray);
    }

    private static void find(int[] inArray) {
        int maxCapacity = 0;
        int left = 0;
        int right = inArray.length - 1;
        while (left < right) {
            int currCapacity = Math.min(inArray[left], inArray[right]) * (right - left);
            maxCapacity = Math.max(maxCapacity, currCapacity);
            if(inArray[left] <= inArray[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Max Capacity: " + maxCapacity);
    }
}
