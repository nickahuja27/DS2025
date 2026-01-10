package com.learning.ds.graphs.takeUfwd;

public class P08_NumberOfIslands {
    private static int[][] matrix =
            {
                    {1, 0, 1, 0, 0, 0, 1, 1, 1, 1},
                    {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 1, 0, 0, 0},
                    {1, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
                    {0, 1, 0, 1, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
                    {1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        int numOfIslands = 0;
        System.out.println("Number of Islands: " + numOfIslands);
    }

    private static void dfs(int row, int col) {
    }

    private static boolean isSafe(int row, int col) {
        if(row < matrix.length && row >= 0 && col >= 0 && col < matrix[0].length &&
                !visited[row][col] && matrix[row][col] == 1)
            return true;
        return false;
    }
}
