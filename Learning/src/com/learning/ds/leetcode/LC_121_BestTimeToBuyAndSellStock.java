package com.learning.ds.leetcode;

public class LC_121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] profits = {7,1,5,3,6,4};
        int maxProfits = findProfits(profits);
        System.out.println(maxProfits);
    }

    private static int findProfits(int[] stockPrices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxSoFar = -1;

        for(int i = 0; i < stockPrices.length; i++) {
            minSoFar = Math.min(minSoFar, stockPrices[i]);
            maxSoFar = Math.max(maxSoFar, stockPrices[i] - minSoFar);
        }

        return maxSoFar;
    }
}
