package com.learning.ds.leetcode;

public class LC_074_Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}};
        boolean present = search(matrix, 0, matrix.length * matrix[0].length - 1, 10);
        System.out.println(present);

    }

    private static boolean search(int[][] matrix, int low, int high, int target) {
        if(low > high)
            return false;

        int mid = (low + high) / 2;
        int midRow = (mid / matrix[0].length); // Find the mid row.
        int midCol = mid % matrix[0].length; //  Find the mid column


        if(matrix[midRow][midCol] == target)
            return true;

        if(matrix[midRow][midCol] < target) {
            return search(matrix, mid + 1, high, target);
        } else {
            return search(matrix, low, mid - 1, target);
        }
    }
}
