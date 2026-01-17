package com.learning.ds.leetcode;

public class LC_122_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] profits = {7,1,5,3,6,4};
        int maxProfits = findProfits(profits);
        System.out.println(maxProfits);
    }

    private static int findProfits(int[] stockPrices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxSoFar = -1;
        int maxProfit = 0;

        for(int i = 0; i < stockPrices.length; i++) {
            minSoFar = Math.min(minSoFar, stockPrices[i]);
            maxSoFar = Math.max(maxSoFar, stockPrices[i] - minSoFar);
            if(maxSoFar != 0 && i < stockPrices.length - 1 && stockPrices[i + 1] < stockPrices[i]) {
                maxProfit += stockPrices[i] - minSoFar;
                minSoFar = Integer.MAX_VALUE;
                maxSoFar = -1;
            } else if(maxSoFar != 0 && i == stockPrices.length - 1) {
                maxProfit = maxSoFar;
            }
        }

        return maxProfit;
    }
}
