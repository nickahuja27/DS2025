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
        if(indexReachedSoFar >= jumpsArr.length - 1) {
            return jumpsSoFar;
        }
        if(jumpsArr[indexReachedSoFar] == 0)
            return Integer.MAX_VALUE;

        int curStartingPoint = indexReachedSoFar;
        int currEndPoint = indexReachedSoFar + jumpsArr[indexReachedSoFar];

        int minJumps = Integer.MAX_VALUE;
        for(int i = curStartingPoint + 1; i <= currEndPoint; i++) {
            int retJumps = findMinJumps(jumpsArr, i, jumpsSoFar + 1);
            minJumps = Math.min(minJumps, retJumps);
        }
        return minJumps;
    }
}
