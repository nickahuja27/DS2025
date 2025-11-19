package com.learning.ds.backtracking.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P9_CombinationSum2 {
    public static void main(String[] args) {
        int[] inArray = {10,1,2,7,6,1,5};
        int TARGET = 8;
        // Sort the array first. Look at the inefficient impl first then it will make more sense.
        // 1,1,2,5,6,7,10
        Arrays.sort(inArray);
        List<List<Integer>> ansList = new ArrayList<>();
        printCombinations(0, inArray, new ArrayList<Integer>(), ansList, TARGET);
        System.out.println(ansList);
    }

    private static void printCombinations(int index, int[] inArray,
                                                      ArrayList<Integer> workingList,
                                                      List<List<Integer>> ansList,
                                                      int targetSum) {
        if(targetSum == 0) {
            ansList.add(new ArrayList<>(workingList));
            return;
        }
        if(targetSum < 0 || index >= inArray.length)
            return;

        for(int i = index; i < inArray.length; i++) {
            if(i > index && inArray[i] == inArray[i-1])
                continue;
            workingList.add(inArray[i]);
            printCombinations(i + 1, inArray, workingList, ansList, targetSum - inArray[i]);
            workingList.remove(workingList.size() - 1);
        }
    }


    private static void printCombinations_Inefficient(int index, int[] inArray,
                                          ArrayList<Integer> workingList,
                                          List<List<Integer>> ansList,
                                          int targetSum) {
        if(targetSum == 0) {
            ansList.add(new ArrayList<>(workingList));
            return;
        }
        if(targetSum < 0 || index >= inArray.length)
            return;

        workingList.add(inArray[index]);
        printCombinations_Inefficient(index + 1, inArray, workingList, ansList, targetSum - inArray[index]);
        workingList.remove(workingList.size() - 1);
        printCombinations_Inefficient(index + 1, inArray, workingList, ansList, targetSum);
    }
}
