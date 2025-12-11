package com.learning.ds.graphs.takeUfwd;

import java.util.LinkedList;
import java.util.Queue;

public class P10_RottenOranges {
    private static int[][] matrix = {
            {1,1,1},
            {1,1,0},
            {0,1,1}};

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        int minTime = bfs(0,0);
        System.out.println("Min time is: " + minTime);
    }

    private static int bfs(int row, int col) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col, 0));
        int timeTaken = -1;

        while (!queue.isEmpty()) {
            Pair tempPair = queue.poll();
            visited[tempPair.row][tempPair.col] = true;

            if(isSafe(tempPair.row - 1, tempPair.col))
                queue.add(new Pair(tempPair.row - 1, tempPair.col, tempPair.time + 1));
            if(isSafe(tempPair.row + 1, tempPair.col))
                queue.add(new Pair(tempPair.row + 1, tempPair.col, tempPair.time + 1));
            if(isSafe(tempPair.row, tempPair.col - 1))
                queue.add(new Pair(tempPair.row, tempPair.col - 1, tempPair.time + 1));
            if(isSafe(tempPair.row, tempPair.col + 1))
                queue.add(new Pair(tempPair.row, tempPair.col + 1, tempPair.time + 1));

            if(queue.isEmpty())
                timeTaken = tempPair.time;
        }

        return timeTaken;
    }

    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length &&
                y >= 0 && y < matrix[0].length &&
                !visited[x][y] && matrix[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static class Pair {
        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
        int row;
        int col;
        int time;
    }

}
