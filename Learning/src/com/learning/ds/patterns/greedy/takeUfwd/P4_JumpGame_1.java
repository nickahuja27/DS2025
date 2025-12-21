package com.learning.ds.patterns.greedy.takeUfwd;

public class P4_JumpGame_1 {
    public static void main(String[] args) {
        int[] jumps = {3,2,1,0,4};
        findJumps(jumps, 0);
        int[] jumps1 = {2,3,1,0,4};
        findJumps(jumps1, 0);
    }

    private static void findJumps(int[] jumps, int indexReachedSoFar) {
        if(indexReachedSoFar >= jumps.length - 1) {
            System.out.println("You can reach in the end...");
            return;
        }
        if(jumps[indexReachedSoFar] == 0)
            return;

        int currStartingPoint = indexReachedSoFar;
        int currEndPoint = indexReachedSoFar + jumps[indexReachedSoFar];

        for (int i = currStartingPoint + 1; i <= currEndPoint; i++) {
            findJumps(jumps, i);
        }
    }
}
