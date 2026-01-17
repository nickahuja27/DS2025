package com.learning.ds.leetcode;

import java.util.Arrays;

public class LC_088_MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = {2,3,5,6,0,0,0};
        int[] array2 = {1,4,7};

        merge(array1, 4, array2, 3);
        System.out.println(Arrays.toString(array1));
    }

    private static void merge(int[] array1, int length1, int[] array2, int length2) {
        int end = length1 + length2 - 1;
        int end1 = length1 - 1;
        int end2 = length2 - 1;

        while (end2 >= 0) {
            if(end1 >= 0) {
                array1[end--] = array1[end1] > array2[end2] ? array1[end1--] : array2[end2--];
            } else {
                array1[end--] = array2[end2--];
            }
        }
    }
}
