package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
import java.util.Stack;

/*
Always for DAG: There should not be any cycle
Order is 5 4 2 3 1 0 OR
         4 5 2 3 1 0
         adjList.get(5).add(0); -> means 5 should come before 0
         in the answer, 5 should be before 0 OR 1 should be before 0

         5 -> 0 <- 4
         5 should come before 0 and 4 should come before 0
 */
public class P21_TopologicalSort {
    private static final int numOfNodes = 6;
    private static boolean[] visited = new boolean[numOfNodes + 1];

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();

    }

    private static void dfs(ArrayList<ArrayList<Integer>> adjList, int node) {

    }


    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(5).add(0);
        adjList.get(5).add(2);

        return adjList;
    }
}
