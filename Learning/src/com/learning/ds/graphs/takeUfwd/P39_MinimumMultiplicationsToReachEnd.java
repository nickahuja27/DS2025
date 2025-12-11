package com.learning.ds.graphs.takeUfwd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P39_MinimumMultiplicationsToReachEnd {
    private static int[] distance = new int[9999];// Because of modulus, this is the max number we will get in any case.
    private static int[] arr = {2, 5, 7};
    private static int START = 3;
    private static int END = 75;

    public static void main(String[] args) {
        Arrays.fill(distance, Integer.MAX_VALUE);
        findDistance();
        System.out.println("Min distance is: " + distance[END]);
    }

    private static void findDistance() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(START);
        distance[START] = 0;

        while (!queue.isEmpty()) {
            int workingNum = queue.poll();
            for(int i = 0; i < arr.length; i++) {
                int newNum = (workingNum * arr[i]) % 10000;
                distance[newNum] = Math.min(distance[newNum], distance[workingNum] + 1);
                if(newNum == END)
                    return;
                queue.add(newNum);
            }
        }
    }
}
