package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_073_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,2,3},
                {3,4,0,2},
                {1,3,1,5}};

        setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void setZeroes(int[][] matrix) {
        boolean firstRowContains0 = false;
        boolean firstColContains0 = false;

        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0)
                firstRowContains0 = true;
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0)
                firstColContains0 = true;
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                for(int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowContains0) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if(firstColContains0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
