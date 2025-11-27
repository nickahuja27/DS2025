package com.learning.ds.backtracking.takeUfwd;

import java.util.ArrayList;

public class P8_CombinationSum {
    public static void main(String[] args) {
        int[] inArray = {2,3,6,7};
        int TARGET = 7;
        printCombinations(0, inArray, new ArrayList<Integer>(), 0, TARGET);
    }
    private static void printCombinations(int index, int[] inArray, ArrayList<Integer> workingList,
                                          int workingSum, int TARGET) {
        if(workingSum == TARGET) {
            System.out.println(workingList);
            return;
        }
        if(workingSum > TARGET || index >= inArray.length) {
            return;
        }

        workingList.add(inArray[index]);
        printCombinations(index, inArray, workingList, workingSum + inArray[index], TARGET);
        workingList.remove(workingList.size() - 1);
        printCombinations(index + 1, inArray, workingList, workingSum, TARGET);
    }
}
