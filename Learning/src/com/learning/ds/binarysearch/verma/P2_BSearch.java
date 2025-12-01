package com.learning.ds.binarysearch.verma;

public class P2_BSearch {
    public static void main(String[] args) {
        int[] numArray = {1,3,6,7,8,9,10,12,13,15,16};
        int numFound = findNum(numArray, 6, 0, numArray.length - 1);
        System.out.println("Num found: " + numFound);
    }

    public static int findNum(int[] numArray, int numToFind, int start, int end) {
        if(start > end)
            return -1;
        int mid = start + (end - start)/2;

        if(numArray[mid] == numToFind)
            return mid;
        else if(numArray[mid] < numToFind) {
            return findNum(numArray, numToFind, mid + 1, end);
        } else {
            return findNum(numArray, numToFind, start, mid - 1);
        }
    }
}
