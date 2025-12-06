package com.learning.ds.heap.verma;

import java.util.PriorityQueue;

public class P2_Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] inArray = {7, 10, 4, 3, 20, 15};
        findKthElement(inArray, 3);
    }

    private static void findKthElement(int[] inArray, int K) {
        // The question is asking for Smallest kth element, so we need to create Max Heap.
        // In Max heap, the top element will always be the largest. The natural order is lowest at the top.
        // LOOK AT THE LAMBDA IN THE QUEUE DEF.
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((i1, i2) -> (i2 - i1));
        for(int i = 0; i < inArray.length; i++) {
            pQueue.add(inArray[i]);
            if(pQueue.size() > K) {
                pQueue.remove();
            }
        }

        System.out.println("Kth smallest element is: " + pQueue.remove());
    }
}
