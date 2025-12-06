package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.GraphNode;

public class P06_DFS {
    public static void main(String[] args) {
        GraphNode<Integer> root = createGraph();
        dfs(root);
    }

    public static void dfs(GraphNode<Integer> node) {
        if(node == null)
            return;

        System.out.print(" "+ node.value);
        node.visited = true;
        for(GraphNode<Integer> neighbor : node.neighbours) {
            if(!neighbor.visited) {
                dfs(neighbor);
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
        GraphNode<Integer> node8 = new GraphNode<Integer>(8);

        node1.addNeighbours(node2);
        node1.addNeighbours(node3);
        node2.addNeighbours(node5);
        node2.addNeighbours(node6);

        node3.addNeighbours(node4);
        node3.addNeighbours(node7);
        node4.addNeighbours(node8);
        node7.addNeighbours(node8);

        return node1;
    }
}
