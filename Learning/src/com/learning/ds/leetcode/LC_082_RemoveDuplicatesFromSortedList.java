package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LC_082_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,2,3,3,3,3,3,4,4,5});
        removeDuplicates(list);
        list.print();
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        Node<Integer> node = list.head;

        while (node != null) {
            if(node.next != null && node.next.next != null &&
                    node.next.value == node.next.next.value) {
                Node<Integer> workingNode = node.next;
                while (workingNode.value == workingNode.next.value) {
                    workingNode = workingNode.next;
                }
                node.next = workingNode.next;
            } else {
                node = node.next;
            }
        }
    }

    private static void removeDuplicatesOld(LinkedList<Integer> list) {
        Node<Integer> prevNode = list.head;
        Node<Integer> currNode = list.head;

        while (currNode != null) {
            boolean duplicateFound = false;
            while (currNode.next != null  && currNode.value == currNode.next.value) {
                currNode = currNode.next;
                duplicateFound = true;
            }

            if(!duplicateFound) {
                if(currNode == list.head) {
                    prevNode = list.head;
                } else {
                    prevNode.next = currNode;
                    prevNode = prevNode.next;
                }
            }
            currNode = currNode.next;
        }
    }
}
