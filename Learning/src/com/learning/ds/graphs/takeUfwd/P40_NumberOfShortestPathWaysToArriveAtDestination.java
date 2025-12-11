package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.WeightedEdge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P40_NumberOfShortestPathWaysToArriveAtDestination {
    private static final int numOfNodes = 10;
    private static final int SRC_NODE = 0;
    private static final int END_NODE = 5;
    private static boolean[] visited = new boolean[numOfNodes];
    private static int[] distance = new int[numOfNodes];
    private static int[] ways = new int[numOfNodes];

    static int[][] edges = {
            {0,1,1},
            {0,2,2},
            {0,3,1},
            {0,4,2},
            {1,5,2},
            {2,5,1},
            {3,5,2},
            {3,7,3},
            {3,6,2},
            {4,6,1},
            {5,8,1},
            {7,8,1},
            {6,8,1}};

    public static void main(String[] args) {
        Arrays.fill(distance, Integer.MAX_VALUE);
        ArrayList<ArrayList<WeightedEdge>> adjList = createGraph();
        findWays(adjList);
        System.out.println(Arrays.toString(distance));
        System.out.println(" Ways: " + Arrays.toString(ways));
    }

    private static void findWays(ArrayList<ArrayList<WeightedEdge>> adjList) {
        PriorityQueue<WeightedEdge> pQueue =
                new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        pQueue.add(new WeightedEdge(SRC_NODE, 0));
        distance[SRC_NODE] = 0;
        while (!pQueue.isEmpty()) {
            WeightedEdge tempNode = pQueue.poll();
            for(WeightedEdge neighbor : adjList.get(tempNode.nodeValue)) {
                int tempWeight = distance[tempNode.nodeValue] + neighbor.weight;
                if(distance[neighbor.nodeValue] == tempWeight) {
                    ways[neighbor.nodeValue] += 1;
                } else if(ways[neighbor.nodeValue] == 0) {
                    ways[neighbor.nodeValue] = 1;
                }

                distance[neighbor.nodeValue] =
                        Math.min(distance[neighbor.nodeValue], tempWeight);
                    pQueue.add(neighbor);
            }
        }
    }

    public static ArrayList<ArrayList<WeightedEdge>> createGraph() {
        ArrayList<ArrayList<WeightedEdge>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(new WeightedEdge(edges[i][1], edges[i][2]));
        }

        return adjList;
    }
}
