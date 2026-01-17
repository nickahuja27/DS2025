package com.learning.ds;

public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public void addNext(Node<T> nextNode) {
        this.next = nextNode;
    }

    public String toString() {
        return value.toString();
    }
}
