package com.learning.ds.binarysearch.verma;

public class P7_NumOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] numArray = {6,7,8,9,10,12,13,15,16,1,2,3};
        int indexFound = findIndex(numArray, 0, numArray.length - 1);
        System.out.println("Number of times rotated: " + indexFound);
    }

    public static int findIndex(int[] inArray, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if(inArray[mid] > inArray[mid - 1] && inArray[mid] > inArray[mid + 1]) {
            return (inArray.length - 1) - mid;
        } else if (inArray[mid] > inArray[start] ) {
            return findIndex(inArray, mid + 1, end);
        } else {
            return findIndex(inArray, start, mid - 1);
        }
    }
}
