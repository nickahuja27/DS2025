package com.learning.ds.leetcode;

import java.util.ArrayList;

public class LC_077_Combinations {
    public static void main(String[] args) {
        findCombinations(4, 2, 1, new ArrayList<>());
    }

    private static void findCombinations(int n, int k, int index, ArrayList<Integer> list) {
        if(list.size() == k) {
            System.out.println(list);
            return;
        }


        for(int i = index; i <= n; i++) {
            list.add(i);
            findCombinations(n, k , i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
