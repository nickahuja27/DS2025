package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
/*
Seq of courses: 3-2-1-0
Take 1 before 0, 2 before 1 and 3 before 2
One of the objective is to determine whether there is any Cycle or not.
LOOK FOR P19 PROBLEM.
 */
public class P24_CourseSchedule_1 {
    private static final int numOfNodes = 10;
    private static boolean[] visited = new boolean[numOfNodes + 1];

    public static void main(String[] args) {
        boolean canComplete = true;

        System.out.println("Can complete all courses: " + canComplete);
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int node) {
        boolean canComplete = true;

        return canComplete;
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
