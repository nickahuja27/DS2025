package com.learning.ds;

public class WeightedEdge {
    public int nodeValue;
    public int weight;

    public WeightedEdge(int nodeValue, int weight) {
        this.nodeValue = nodeValue;
        this.weight = weight;
    }

    public String toString() {
        return "Node:" + nodeValue + ", Weight: " + weight;
    }
}
