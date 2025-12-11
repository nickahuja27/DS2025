package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.WeightedEdge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P32_DijkstraShortestPath_PriorityQueue {
    private static final int numOfNodes = 6;
    private static final int SRC_NODE = 0;
    private static final int END_NODE = 5;
    private static boolean[] visited = new boolean[numOfNodes];
    private static int[] distance = new int[numOfNodes];

    public static void main(String[] args) {
        Arrays.fill(distance, Integer.MAX_VALUE);
        ArrayList<ArrayList<WeightedEdge>> adjList = createGraph();
        findShortestPath(adjList);
        System.out.println(Arrays.toString(distance));
    }

    private static void findShortestPath(ArrayList<ArrayList<WeightedEdge>> adjList) {
        PriorityQueue<WeightedEdge> pQueue =
                new PriorityQueue<>((edge1, edge2) -> edge1.weight - edge2.weight);

        pQueue.add(new WeightedEdge(SRC_NODE, 0));
        distance[SRC_NODE] = 0;

        while (!pQueue.isEmpty()) {
            WeightedEdge tempNode = pQueue.poll();
            visited[tempNode.nodeValue] = true;
            for (WeightedEdge neighbor : adjList.get(tempNode.nodeValue)) {
                distance[neighbor.nodeValue] = Math.min(distance[neighbor.nodeValue],
                        distance[tempNode.nodeValue] + neighbor.weight);
                if(!visited[neighbor.nodeValue]) {
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

        adjList.get(0).add(new WeightedEdge(1, 4));
        adjList.get(0).add(new WeightedEdge(2, 4));

        adjList.get(1).add(new WeightedEdge(0, 4));
        adjList.get(1).add(new WeightedEdge(2, 2));

        adjList.get(2).add(new WeightedEdge(0, 4));
        adjList.get(2).add(new WeightedEdge(1, 2));
        adjList.get(2).add(new WeightedEdge(3, 3));
        adjList.get(2).add(new WeightedEdge(4, 1));
        adjList.get(2).add(new WeightedEdge(5, 6));

        adjList.get(3).add(new WeightedEdge(2, 3));
        adjList.get(3).add(new WeightedEdge(5, 2));

        adjList.get(4).add(new WeightedEdge(2, 1));
        adjList.get(4).add(new WeightedEdge(5, 3));

        adjList.get(5).add(new WeightedEdge(2, 6));
        adjList.get(5).add(new WeightedEdge(3, 2));
        adjList.get(5).add(new WeightedEdge(4, 3));

        return adjList;
    }
}
