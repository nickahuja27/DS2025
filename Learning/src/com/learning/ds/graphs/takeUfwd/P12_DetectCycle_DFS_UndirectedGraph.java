package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.GraphNode;

public class P12_DetectCycle_DFS_UndirectedGraph {
    private static final int numOfNodes = 8;
    private static boolean[] visited = new boolean[numOfNodes];

    public static void main(String[] args) {
        GraphNode<Integer> node = createGraph();
        dfs(node, -1);
    }

    private static void dfs(GraphNode<Integer> node, int parentNode) {
        if(node == null) return;
        visited[node.value] = true;

        for(GraphNode<Integer> neighbor : node.neighbours) {
            if(!visited[neighbor.value] && neighbor.value != parentNode) {
                dfs(neighbor, node.value);
            } else if (visited[neighbor.value] && neighbor.value != parentNode) {
                System.out.println("Cycle Detected...");
            }
        }
    }

    public static GraphNode<Integer> createGraph() {
        GraphNode<Integer> node1 = new GraphNode<Integer>(1);
        GraphNode<Integer> node2 = new GraphNode<Integer>(2);
        GraphNode<Integer> node3 = new GraphNode<Integer>(3);
        GraphNode<Integer> node4 = new GraphNode<Integer>(4);
        GraphNode<Integer> node5 = new GraphNode<Integer>(5);
        GraphNode<Integer> node6 = new GraphNode<Integer>(6);
        GraphNode<Integer> node7 = new GraphNode<Integer>(7);

        node1.addNeighbours(node2);
        node1.addNeighbours(node3);

        //node2.addNeighbours(node1);
        node2.addNeighbours(node5);

        //node3.addNeighbours(node1);
        node3.addNeighbours(node4);
        node3.addNeighbours(node6);

        //node4.addNeighbours(node3);

        //node5.addNeighbours(node2);
        node5.addNeighbours(node7);

        //node6.addNeighbours(node3);
        node6.addNeighbours(node7);

        //node7.addNeighbours(node5);
        //node7.addNeighbours(node6);


        return node1;
    }
}
