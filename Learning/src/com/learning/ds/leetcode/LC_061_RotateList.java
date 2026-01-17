package com.learning.ds.leetcode;

import com.learning.ds.LinkedList;
import com.learning.ds.Node;

public class LC_061_RotateList {
    public static void main(String[] args) {
        LinkedList<Integer> list = LinkedList.create(new int[]{1,2,3,4,5});
        rotate(list, 3);
        list.print();
    }

    private static void rotate(LinkedList<Integer> list, int numOfRotations) {
        Node<Integer> origHead = list.head;
        Node<Integer> slowPointer = null;
        Node<Integer> fastPointer = list.head;

        for(int i = 0; i < numOfRotations -1; i++) {
            fastPointer = fastPointer.next;
        }
        list.head = fastPointer;
        System.out.println("Fast Pointer: "+ fastPointer.value);

        while (fastPointer.next != null) {
            slowPointer = slowPointer == null ? origHead : slowPointer.next;
            fastPointer = fastPointer.next;
        }
        System.out.println("Slow Pointer: " + slowPointer.value);
        fastPointer.next = origHead;
        slowPointer.next = null;


    }
}
