package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P19_DetectCycleInDirectedGraphUsingDFS {
    private static final int numOfNodes = 10;
    private static boolean[] visited = new boolean[numOfNodes + 1];
    private static Set<Integer> pathVisited = new HashSet<>();

    public static void main(String[] args) {
    }

    private static boolean isCyclic(int node, ArrayList<ArrayList<Integer>> adjList) {
        return false;
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(2).add(8);
        adjList.get(3).add(4);
        adjList.get(3).add(7);
        adjList.get(4).add(5);
        adjList.get(7).add(5);
        adjList.get(5).add(6);

        adjList.get(8).add(9);
        adjList.get(9).add(10);
        adjList.get(10).add(8);


        return adjList;
    }
}
