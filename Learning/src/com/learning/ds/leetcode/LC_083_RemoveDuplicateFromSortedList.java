package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LC_083_RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,1,2,3,3,4,5});
        removeDuplicates(list);
        list.print();
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        Node<Integer> prevNode = list.head;
        Node<Integer> currNode = list.head.next;

        LinkedList<Integer> newList = new LinkedList<>();
        newList.head = prevNode;

        while (currNode != null) {
            if(currNode.value == prevNode.value) {
                currNode = currNode.next;
            } else {
                prevNode.next = currNode;
                prevNode = prevNode.next;
                currNode = currNode.next;
            }
        }
    }
}
