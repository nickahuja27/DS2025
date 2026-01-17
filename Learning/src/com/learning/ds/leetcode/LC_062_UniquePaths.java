package com.learning.ds.leetcode;

public class LC_062_UniquePaths {
    public static void main(String[] args) {
        int[][] matrix = new int[3][7];
        matrix[0][0] = 1;
        matrix[2][6] = 2;
        int paths = uniquePaths(matrix, 0, 0, 0);
        System.out.println(paths);
    }

    private static int uniquePaths(int[][] matrix, int row, int col, int numOfPaths) {
        if(row == matrix.length - 1 && col == matrix[0].length - 1) {
            return 1 + numOfPaths;
        }
        if(!isValid(matrix, row, col))
            return 0;

        int rightPaths = uniquePaths(matrix, row + 1, col, numOfPaths);
        int downPaths = uniquePaths(matrix, row, col + 1, numOfPaths);
        return rightPaths + downPaths;
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
        col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
