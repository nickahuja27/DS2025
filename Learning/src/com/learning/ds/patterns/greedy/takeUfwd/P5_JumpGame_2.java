package com.learning.ds.patterns.greedy.takeUfwd;

public class P5_JumpGame_2 {
    public static void main(String[] args) {
        int[] jumpsArr = {1,2,3,1,1,0,2,5};
        int minJumps = findMinJumps(jumpsArr, 0, 0);
        System.out.println("Minimum Jumps required are: " + minJumps);

        int[] jumpsArr1 = {1,2,4,1,1,0,2,5};
        minJumps = findMinJumps(jumpsArr1, 0, 0);
        System.out.println("Minimum Jumps required are: " + minJumps);
    }

    private static int findMinJumps(int[] jumpsArr, int indexReachedSoFar, int jumpsSoFar) {

        return -1;
    }
}
