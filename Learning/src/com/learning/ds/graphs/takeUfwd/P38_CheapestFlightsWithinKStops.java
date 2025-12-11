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
        //There is infact no need for a PQ. A simple queue will work just as fine.
        PriorityQueue<WorkingNode> pQueue = new PriorityQueue<>((e1, e2) -> e1.stops - e2.stops);
//        Queue<WorkingNode> pQueue = new LinkedList<>();
        distance[SRC_NODE] = 0;
        pQueue.add(new WorkingNode(0, SRC_NODE, 0));

        while (!pQueue.isEmpty()) {
            WorkingNode tempNode = pQueue.poll();
            if(tempNode.stops > K) continue;
            for(WorkingNode neighbor : adjList.get(tempNode.value)) {
                    distance[neighbor.value] = Math.min(distance[neighbor.value],
                            distance[tempNode.value] + neighbor.weight);
                    pQueue.add(new WorkingNode(tempNode.stops + 1, neighbor.value, neighbor.weight));
            }
        }
    }

    private static class WorkingNode {
        public int stops;
        public int value;
        public int weight;
        public WorkingNode(int stops, int value, int weight) {
            this.stops = stops;
            this.value = value;
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
