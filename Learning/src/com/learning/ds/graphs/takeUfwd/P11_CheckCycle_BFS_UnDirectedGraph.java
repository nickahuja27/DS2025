package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

public class P11_CheckCycle_BFS_UnDirectedGraph {
    private static boolean[] visited = new boolean[8];

    public static void main(String[] args) {
        GraphNode<Integer> node = createGraph();
        findCycleBFS(node);
    }

    private static void findCycleBFS(GraphNode<Integer> node) {
        Queue<WorkingNode> queue = new LinkedList<>();
        queue.add(new WorkingNode(node, new GraphNode(-1)));
        visited[node.value] = true;

        while (!queue.isEmpty()) {
            WorkingNode<Integer> tempNode = queue.poll();
            for(GraphNode<Integer> neighbor : tempNode.node.neighbours) {
                if(!visited[neighbor.value] &&
                        neighbor.value != tempNode.parentNode.value) {
                    visited[neighbor.value] = true;
                    queue.add(new WorkingNode(neighbor, tempNode.node));
                } else if(visited[neighbor.value] && neighbor.value != tempNode.parentNode.value) {
                    System.out.println("Cycle Detected...");
                    return;
                }
            }
        }
    }

    public static class WorkingNode<Integer> {
        GraphNode<Integer> node;
        GraphNode<Integer> parentNode;
        public WorkingNode(GraphNode<Integer> node, GraphNode<Integer> parentNode) {
            this.node = node;
            this.parentNode = parentNode;
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

        node2.addNeighbours(node1);
        node2.addNeighbours(node5);

        node3.addNeighbours(node1);
        node3.addNeighbours(node4);
        node3.addNeighbours(node6);

        node4.addNeighbours(node3);

        node5.addNeighbours(node2);
        node5.addNeighbours(node7);

        node6.addNeighbours(node3);
        node6.addNeighbours(node7);

        node7.addNeighbours(node5);
        node7.addNeighbours(node6);


        return node1;
    }
}
