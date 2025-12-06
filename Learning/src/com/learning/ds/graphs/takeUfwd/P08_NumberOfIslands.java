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
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1 && visited[i][j] == false) {
                    numOfIslands++;
                    dfs(i, j);
                }
            }
        }

        System.out.println("Number of Islands: " + numOfIslands);
    }

    private static void dfs(int row, int col) {
        if(visited[row][col]) return;
        visited[row][col] = true;

        if (isSafe(row - 1, col - 1))
            dfs(row - 1, col - 1);
        if (isSafe(row - 1, col))
            dfs(row - 1, col);
        if (isSafe(row - 1, col + 1))
            dfs(row - 1, col + 1);
        if (isSafe(row, col - 1))
            dfs(row, col - 1);
        if (isSafe(row, col + 1))
            dfs(row, col + 1);
        if (isSafe(row + 1, col - 1))
            dfs(row + 1, col - 1);
        if (isSafe(row + 1, col))
            dfs(row + 1, col);
        if (isSafe(row + 1, col + 1))
            dfs(row + 1, col + 1);
    }

    private static boolean isSafe(int row, int col) {
        if(row < matrix.length && row >= 0 && col >= 0 && col < matrix[0].length &&
                !visited[row][col] && matrix[row][col] == 1)
            return true;
        return false;
    }
}
