package com.learning.ds;

public class Utils {
    public static void swap(int[] inArray, int i, int j) {
        int temp = inArray[i];
        inArray[i] = inArray[j];
        inArray[j] = temp;
    }
}
