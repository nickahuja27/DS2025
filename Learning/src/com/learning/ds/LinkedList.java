package com.learning.ds;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size = 0;

    public static LinkedList create() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return create(values);
    }

    public static LinkedList create(int[] values) {
        LinkedList newList = new LinkedList();
        for (int value : values) {
            if (newList.head == null) {
                newList.head = new Node(value);
                newList.tail = newList.head;
            } else {
                newList.tail.next = new Node(value);
                newList.tail = newList.tail.next;
            }
        }
        newList.size = values.length;
        return newList;
    }

    public void print() {
        print(head);
    }

    public void add(T value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.tail = this.head;
        } else {
            this.tail.next = new Node(value);
            this.tail = this.tail.next;
        }
        size++;
    }

    public void print(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}
