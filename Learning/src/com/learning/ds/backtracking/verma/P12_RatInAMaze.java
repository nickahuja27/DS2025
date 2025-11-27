package com.learning.ds.backtracking.verma;

import java.util.ArrayList;
import java.util.List;

public class P12_RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        solve(maze, visited, 0, 0, "");
    }

    // Assuming that we start the recursion with a row-col as 1.
    private static void solve(int[][] maze, boolean[][] visited, int row, int col, String outPath) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.printf("\n Path: " + outPath.toString());
            return;
        }
        visited[row][col] = true;
        if(isValid(maze, visited, row - 1, col)) {
            solve(maze, visited, row - 1, col, outPath + "U");
        }
        if(isValid(maze, visited, row + 1, col)) {
            solve(maze, visited, row + 1, col, outPath + "D");
        }
        if(isValid(maze, visited, row, col - 1)) {
            solve(maze, visited, row, col - 1, outPath + "L");
        }
        if(isValid(maze, visited, row, col + 1)) {
            solve(maze, visited, row, col + 1, outPath + "R");
        }
        visited[row][col] = false;
    }

    private static boolean isValid(int[][] maze, boolean[][] visited, int row, int column) {
        if(row >= 0 && column >= 0 && row < maze.length &&
            column < maze[0].length &&
            !visited[row][column] &&
            maze[row][column] == 1) {
            return true;
        }
        return false;
    }
}
