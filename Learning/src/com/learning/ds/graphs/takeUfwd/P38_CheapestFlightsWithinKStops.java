package com.learning.ds.graphs.takeUfwd;

import java.util.*;

public class P38_CheapestFlightsWithinKStops {
    private static final int numOfNodes = 6;
    private static final int SRC_NODE = 0;
    private static final int END_NODE = 2;
    private static int[] distance = new int[numOfNodes];

    static int[][] edges = {
            {0,1,5},
            {0,3,2},
            {3,1,2},
            {1,2,5},
            {1,4,1},
            {4,2,1}};

    public static void main(String[] args) {
        Arrays.fill(distance, Integer.MAX_VALUE);
        ArrayList<ArrayList<WorkingNode>> adjList = createGraph();
        findFlights(adjList, 2);// K is number of stops, excluding SRC and Destination.
        System.out.println(Arrays.toString(distance));
    }

    private static void findFlights(ArrayList<ArrayList<WorkingNode>> adjList, int K) {

    }

    private static class WorkingNode {
        public int stops;
        public int toNode;
        public int weight;
        public WorkingNode(int stops, int toNode, int weight) {
            this.stops = stops;
            this.toNode = toNode;
            this.weight = weight;
        }
    }

    public static ArrayList<ArrayList<WorkingNode>> createGraph() {
        ArrayList<ArrayList<WorkingNode>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(new WorkingNode(0, edges[i][1], edges[i][2]));
        }

        return adjList;
    }
}
