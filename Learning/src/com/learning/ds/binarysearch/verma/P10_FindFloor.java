package com.learning.ds.binarysearch.verma;

public class P10_FindFloor {
    public static void main(String[] args) {
        int[] numArray = {1,3,5, 6,7,8,9,10,12,13,15,16};
        int numFound = findNum(numArray, 4, 0, numArray.length - 1);
        System.out.println("Num found: " + numFound);
    }

    public static int findNum(int[] numArray, int numToFind, int start, int end) {
        if(start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if(numToFind == numArray[mid] ||
                (numToFind > numArray[mid] && numToFind < numArray[mid + 1])) {
            return numArray[mid];
        }

        if(numArray[mid] > numToFind) {
            return findNum(numArray, numToFind, start, mid - 1);
        } else {
            return findNum(numArray, numToFind, mid + 1, end);
        }
    }
}
