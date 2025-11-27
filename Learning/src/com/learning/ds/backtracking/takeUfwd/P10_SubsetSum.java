package com.learning.ds.backtracking.takeUfwd;

import java.util.ArrayList;
import java.util.List;

public class P10_SubsetSum {
    public static void main(String[] args) {
        int[] inArray = {3,1,2};
        printSubsets(0, inArray, new ArrayList<Integer>());
    }

    private static void printSubsets(int index, int[] inArray, List<Integer> workingList) {
        if(index == inArray.length) {
            System.out.println(workingList);
            return;
        }

        workingList.add(inArray[index]);
        printSubsets(index + 1, inArray, workingList);
        workingList.remove(workingList.size() - 1);
        printSubsets(index + 1, inArray, workingList);
    }
}
