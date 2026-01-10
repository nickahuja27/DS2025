package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P05_BFSTraversal {
    public static void main(String[] args) {
        GraphNode<Integer> root = createGraph();
        bfs(root);
    }

    public static void bfs(GraphNode<Integer> node) {

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
        node1.addNeighbours(node6);
        node2.addNeighbours(node3);
        node2.addNeighbours(node4);
        node6.addNeighbours(node7);
        node6.addNeighbours(node8);
        node4.addNeighbours(node5);
        node7.addNeighbours(node5);

        return node1;
    }
}
