package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.WeightedEdge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P35_PrintShortestPath_DijkstrasAlgorithm {
    private static final int numOfNodes = 6;
    private static final int SRC_NODE = 1;
    private static final int END_NODE = 5;
    private static boolean[] visited = new boolean[numOfNodes];
    private static int[] distance = new int[numOfNodes];
    private static int[] parent = new int[numOfNodes];

    static int[][] edges = {
            {1,2,2},
            {2,5,5},
            {2,3,4},
            {1,4,1},
            {4,3,3},
            {3,5,1}};

    public static void main(String[] args) {
        ArrayList<ArrayList<WeightedEdge>> adjList = createGraph();
        Arrays.fill(distance, Integer.MAX_VALUE);
        findShortestPath(adjList);
        System.out.println("Distance" + Arrays.toString(distance));
        System.out.println("Parent" + Arrays.toString(parent));
    }

    private static void findShortestPath(ArrayList<ArrayList<WeightedEdge>> adjList) {
        PriorityQueue<WeightedEdge> pQueue =
                new PriorityQueue<>((edge1, edge2) -> edge1.weight - edge2.weight);

        pQueue.add(new WeightedEdge(SRC_NODE, 0));
        distance[SRC_NODE] = 0;
        parent[SRC_NODE] = -1;

        while (!pQueue.isEmpty()) {
            WeightedEdge tempNode = pQueue.poll();
            visited[tempNode.nodeValue] = true;
            for(WeightedEdge neighbor : adjList.get(tempNode.nodeValue)) {
                int oldDist = distance[neighbor.nodeValue];
                int newDist = distance[tempNode.nodeValue] + neighbor.weight;
                if(newDist < oldDist) {
                    distance[neighbor.nodeValue] = newDist;
                    parent[neighbor.nodeValue] = tempNode.nodeValue;
                }
                if (!visited[neighbor.nodeValue]) {
                    pQueue.add(neighbor);
                }
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
