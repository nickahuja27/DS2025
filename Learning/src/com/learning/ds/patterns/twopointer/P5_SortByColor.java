package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

import static com.learning.ds.Utils.swap;

public class P5_SortByColor {
    public static void main(String[] args) {
        int[] inArray = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        solution(inArray);
        System.out.println(Arrays.toString(inArray));
    }

    private static void solution(int[] inArray) {
        int left = 0;
        int right = inArray.length - 1;
        int pointer = 0;

        while (pointer <= right) {
            if(inArray[pointer] == 0) {
                swap(inArray, pointer, left);
                left++;
                pointer++;
            } else if (inArray[pointer] == 1) {
                pointer++;
            } else if (inArray[pointer] == 2) {
                swap(inArray, pointer, right);
                right--;
            }
        }
    }
}
