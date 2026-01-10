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
    }
}
