package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LC_086_PartitionList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,4,3,2,5,2});
        rearrange(list, 3);
    }

    private static void rearrange(LinkedList<Integer> origList, int target) {
        LinkedList<Integer> smallerList = new LinkedList<>();
        LinkedList<Integer> largerList = new LinkedList<>();
        Node<Integer> prevNode = null;
        Node<Integer> currNode = origList.head;

        while (currNode != null) {
            if(currNode.value < target) {
                smallerList.add(currNode.value);// you can refer also
            } else {
                largerList.add(currNode.value);
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        smallerList.print();// Ideally you should combine these 2 lists into 1.
        largerList.print();
    }
}
