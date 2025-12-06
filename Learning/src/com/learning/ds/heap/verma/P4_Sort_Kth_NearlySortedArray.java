package com.learning.ds.heap.verma;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P4_Sort_Kth_NearlySortedArray {
    public static void main(String[] args) {
        int[] inArray = {6,5,3,2,8,10,9};
        sort(inArray, 3);
        System.out.println(Arrays.toString(inArray));
    }

    private static void sort(int[] inArray, int K) {
        //We will use natural sorting on Queue, making the smallest element at the top.
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(); // (i1, i2) -> i1 - i2
        for(int i = 0; i < inArray.length; i++) {
            pQueue.add(inArray[i]);
            if(pQueue.size() > K) {
                inArray[i - K] = pQueue.remove();
            }
        }
        int i = inArray.length - K;
        while (!pQueue.isEmpty()) {
            inArray[i++] = pQueue.remove();
        }
    }
}
