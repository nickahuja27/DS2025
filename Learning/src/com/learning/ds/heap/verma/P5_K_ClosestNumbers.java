package com.learning.ds.heap.verma;

import java.util.PriorityQueue;

public class P5_K_ClosestNumbers {
    public static void main(String[] args) {
        int[] inArray = {5,6,7,8,9};
        int closestOf = 7;
        findClosest(inArray, closestOf, 3);
    }

    private static void findClosest(int[] inArray, int numToCompare, int K) {
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p2.difference - p1.difference);
        for(int number : inArray) {
            pQueue.add(new Pair(Math.abs(number - numToCompare), number));
            if(pQueue.size() > K) {
                pQueue.remove();
            }
        }

        while (!pQueue.isEmpty())
            System.out.println(pQueue.remove().number);
    }

    private static class Pair {
        public int difference;
        public int number;
        public Pair(int difference, int number){
            this.difference = difference;
            this.number = number;
        }
    }
}
