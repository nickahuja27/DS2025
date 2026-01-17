package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_064_MinPathSum {
    static int minSum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}};

        int pathSum = minPathSumTreeWay(matrix, 0, 0);
        System.out.println(pathSum);

        minPathSum(matrix, 0, 0, 0);
        System.out.println(minSum);

        int[][] dp = new int[matrix.length][matrix.length];
        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        minPathSum(matrix, 0, 0, 0, dp);
        for(int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[2][2]);
    }

    private static void minPathSum(int[][] matrix, int row, int col, int sumSoFar, int[][] dp) {
        if(!isValid(matrix, row, col))
            return;

        if(dp[row][col] == Integer.MAX_VALUE) {
            dp[row][col] = sumSoFar + matrix[row][col];
            minPathSum(matrix, row, col + 1, sumSoFar + matrix[row][col], dp);
            minPathSum(matrix, row + 1, col, sumSoFar + matrix[row][col], dp);
        } else {
            dp[row][col] = Math.min(dp[row][col], sumSoFar + matrix[row][col]);
        }
    }

    private static void minPathSum(int[][] matrix, int row, int col, int sumSoFar) {
        if(row == matrix.length - 1 && col == matrix.length - 1)
            minSum = Math.min(minSum, sumSoFar + matrix[matrix.length - 1][matrix.length - 1]);

        if(!isValid(matrix, row , col))
            return;

        minPathSum(matrix, row + 1, col, sumSoFar + matrix[row][col]);
        minPathSum(matrix, row, col + 1, sumSoFar + matrix[row][col]);
    }

    /*
    Create a Tree then you can visualize
     */
    private static int minPathSumTreeWay(int[][] matrix, int row, int col) {
        if(row == matrix.length - 1 && col == matrix.length - 1) {
            return matrix[row][col];
        }

        if(!isValid(matrix, row, col))
            return 0;

        int rMin = minPathSumTreeWay(matrix, row, col + 1);
        int dMin = minPathSumTreeWay(matrix, row + 1, col);

        if(rMin == 0 || dMin == 0)
            return matrix[row][col] + rMin + dMin;
        else
            return matrix[row][col] + Math.min(rMin, dMin);
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
