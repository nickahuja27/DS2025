package com.learning.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNode<T> {
    public T value;
    public boolean visited;
    public List<GraphNode<T>> neighbours = new ArrayList<>();
    public Map<GraphNode<T>, Integer> weightedAdjNodes = new HashMap<>();

    public GraphNode(T value) {
        this.value = value;
    }

    /*
        1 ------> 3  --------> 6
        |       *   \             \
        |     /   |    \             *
        |   /     |      \            7
        * /       *        *         *
        2 ------> 4  -------> 5
\
     */
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
        node2.addNeighbours(node4);
        node3.addNeighbours(node2);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node3.addNeighbours(node6);
        node4.addNeighbours(node5);
        node5.addNeighbours(node7);
        node6.addNeighbours(node7);

        return node1;
    }

    public void addNeighbours(GraphNode<T> neighbourNode) {
        this.neighbours.add(neighbourNode);
    }

    public List<GraphNode<T>> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<GraphNode<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public void addWeightedAdjNode(GraphNode<T> newNode, int weight) {
        this.neighbours.add(newNode);
        this.weightedAdjNodes.put(newNode, weight);
        return;
    }

    public Map<GraphNode<T>, Integer> getWeightedAdjNodesMap() {
        return weightedAdjNodes;
    }

    public String toString() {
        return ""+value;
    }
}