package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
/*
Seq of courses: 3-2-1-0
Take 1 before 0, 2 before 1 and 3 before 2
 */
public class P24_CourseSchedule_1 {
    private static final int numOfNodes = 4;
    private static boolean[] visited = new boolean[numOfNodes + 1];

    public static void main(String[] args) {
        boolean canComplete = true;
        ArrayList<ArrayList<Integer>> adjList = createGraph();
        //NOTE THAT THE LOOP IS RUN FROM COURSE TAKEN FIRST TO COURSE TAKEN LAST.
        for(int i = numOfNodes - 1; i >= 0; i--) {
            if(!visited[i]) {
                canComplete = dfs(adjList, i);
                if(!canComplete)
                    break;
            }
        }

        System.out.println("Can complete all courses: " + canComplete);
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int node) {
        boolean canComplete = true;
        visited[node] = true;
        for(int neighbor : adjList.get(node)) {
            if(visited[neighbor]) {
                canComplete = false;
                break;
            }
            canComplete = dfs(adjList, neighbor);
        }
        return canComplete;
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(0);
        adjList.get(2).add(1);
        adjList.get(3).add(2);
        adjList.get(0).add(3);

        return adjList;
    }
}
