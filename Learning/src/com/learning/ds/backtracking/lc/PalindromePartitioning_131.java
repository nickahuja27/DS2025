package com.learning.ds.backtracking.lc;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {
    private static List<ArrayList<String>> partitionsList = new ArrayList<>();

    public static void main(String[] args) {
        String inString = "aab";
        findPartitions(inString, 0, new ArrayList<>());
        System.out.println(partitionsList);
    }

    private static void findPartitions(String inString, int index, ArrayList<String> partitionsSoFar) {
        if(index >= inString.length()) {
            partitionsList.add(new ArrayList<>(partitionsSoFar));
            return;
        }

        for(int i = index; i < inString.length(); i++) {
            if(isPalindrome(inString, index, i)) {
                partitionsSoFar.add(inString.substring(index, i + 1));
                findPartitions(inString, i + 1, partitionsSoFar);
                partitionsSoFar.remove(partitionsSoFar.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(final String inString, int l, int r) {
        while (l <= r)
            if (inString.charAt(l++) != inString.charAt(r--))
                return false;
        return true;
    }
}
