package com.learning.ds.graphs.takeUfwd;

import java.util.LinkedList;
import java.util.Queue;

public class P36_ShortestDistanceInBinaryMaze {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    private static int[][] mat = {
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
            {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}
    };
    private static boolean[][] visited = new boolean[mat.length][mat[0].length];

    public static void main(String[] args) {
        Node srcNode = new Node(0,0,0);
        Node destNode = new Node(3,4, 0);
        Node resultNode = findShortestPath(srcNode, destNode);
        System.out.println("Shortest distance is: " + resultNode.distance);
    }

    private static Node findShortestPath(Node srcNode, Node destNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(srcNode);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();

            if (tempNode.row == destNode.row && tempNode.col == destNode.col)
                return tempNode;

            for(int i = 0; i < dx.length; i++) {
                if(isValid(tempNode.row + dx[i], tempNode.col + dy[i])) {
                    visited[tempNode.row][tempNode.col] = true;
                    queue.add(new Node(tempNode.row + + dx[i],
                            tempNode.col + dy[i], tempNode.distance + 1));
                }
            }
        }
        return null;
    }

    private static boolean isValid(int row, int col) {
        if(row >= 0 && col >= 0 &&
                row < mat.length && col < mat[0].length &&
                mat[row][col] == 1 &&
                    !visited[row][col]) {
            return true;
        }
        return false;
    }

    private static class Node {
        public int row;
        public int col;
        public int distance;

        public Node(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }
}
