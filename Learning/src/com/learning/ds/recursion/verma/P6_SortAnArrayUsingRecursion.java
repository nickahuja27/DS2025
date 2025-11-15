package com.learning.ds.recursion.verma;

import java.util.Arrays;

public class P6_SortAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] inArray = {3,6,1,9,4,2,5,8,7};
        sortArray(inArray, inArray.length - 1);
        System.out.println(Arrays.toString(inArray));
    }

    private static void sortArray(int[] inArray, int index) {
         if(index < 0)
             return;

         int poppedNum = inArray[index];
         sortArray(inArray, index - 1);
         insertNumAtRightPosition(inArray, index, poppedNum);
    }

    private static void insertNumAtRightPosition(int[] inArray, int index, int numToAdd) {
        if(index == 0) {
            inArray[index] = numToAdd;
            return;
        }
        if(inArray[index - 1] > numToAdd) {
            int poppedNum = inArray[index - 1];
            insertNumAtRightPosition(inArray, index - 1, numToAdd);
            inArray[index] = poppedNum;
        } else {
            inArray[index] = numToAdd;
        }
    }
}
