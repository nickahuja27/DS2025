package com.learning.ds.heap.verma;

import java.util.HashMap;
import java.util.PriorityQueue;

public class P7_FreqSort {
    public static void main(String[] args) {
        int[] inArray = {1,1,1,3,2,2,4,4,4,4,4,4,4};
        sort(inArray, 2);
    }

    private static void sort(int[] inArray, int K) {
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p1.frequency - p2.frequency);
        HashMap<Integer, Integer> freqMap = new HashMap();

        for(int number : inArray) {
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        }

        for(int key : freqMap.keySet()) {
            pQueue.add(new Pair(key, freqMap.get(key)));
        }
        while (!pQueue.isEmpty()) {
            Pair tempPair = pQueue.remove();
            System.out.println("Number: " + tempPair.number + ", Freq: " + tempPair.frequency);
        }
    }

    private static class Pair {
        public int frequency;
        public int number;
        public Pair(int number, int frequency){
            this.frequency = frequency;
            this.number = number;
        }
    }
}
