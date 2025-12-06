package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
import java.util.Stack;

// Use P24_CourseSchedule_1 and List instead of Stack to list the sequence of courses.
public class P24_CourseSchedule_2 {
    private static final int numOfNodes = 4;
    private static boolean[] visited = new boolean[numOfNodes + 1];
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();
        for(int i = 0; i < numOfNodes; i++) {
            if(!visited[i]) {
                dfs(adjList, i);
            }
        }
        while (!stack.isEmpty())
            System.out.print(" " + stack.pop());
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adjList, int node) {
        visited[node] = true;
        for(int neighbor : adjList.get(node)) {
            if(!visited[neighbor])
                dfs(adjList, neighbor);
        }
        stack.push(node);
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(0);
        adjList.get(2).add(1);
        adjList.get(3).add(2);

        return adjList;
    }
}
