package com.learning.ds.backtracking.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Leetcode 90:
public class P11_SubsetSum2 {
    public static void main(String[] args) {
        int[] inArray = {1,2,2};
        Arrays.sort(inArray);
        List<List<Integer>> ansList = new ArrayList<>();
        printSubsets(0, inArray, new ArrayList<Integer>(), ansList);
        System.out.println(ansList);
    }

    private static void printSubsets(int index, int[] inArray,
                                     ArrayList<Integer> workingList,
                                     List<List<Integer>> ansList) {

        ansList.add(new ArrayList<>(workingList));
        if(index >= inArray.length)
            return;

        for(int i = index; i < inArray.length; i++) {
            if(i > index && inArray[i] == inArray[i-1])
                continue;
            workingList.add(inArray[i]);
            printSubsets(i + 1, inArray, workingList, ansList);
            workingList.remove(workingList.size() - 1);
        }
    }
}
