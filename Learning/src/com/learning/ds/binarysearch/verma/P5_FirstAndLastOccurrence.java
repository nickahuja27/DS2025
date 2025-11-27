package com.learning.ds.binarysearch.verma;

public class P5_FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] numArray = {1, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10, 12, 13, 15, 16};
        findFirstAndLastOccurence(numArray, 6);
    }

    private static void findFirstAndLastOccurence(int[] numArray, int numToFind) {
        int firstOcc = findFirstOccurrence(numArray, numToFind, 0, numArray.length - 1);
        int lastOcc = findLastOccurrence(numArray, numToFind, 0, numArray.length - 1);
        System.out.println("First: " + firstOcc);
        System.out.println("Last: " + lastOcc);
    }

    private static int findFirstOccurrence(int[] numArray, int numToFind, int start, int end) {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if((mid == 0 && numArray[mid] == numToFind) ||
                (numArray[mid] == numToFind && numArray[mid] > numArray[mid - 1])) {
            return mid;
        } else if (numArray[mid] >= numToFind) {
            //If we have found the number, we need to move left because we have to find first occurrence
            return findFirstOccurrence(numArray, numToFind, start, mid - 1);
        } else {
            return findFirstOccurrence(numArray, numToFind, mid + 1, end);
        }
    }

    private static int findLastOccurrence(int[] numArray, int numToFind, int start, int end) {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if((mid == numArray.length - 1 && numArray[mid] == numToFind) ||
                (numArray[mid] == numToFind && numArray[mid] < numArray[mid + 1])) {
            return mid;
        } else if (numArray[mid] <= numToFind) {
            //If we have found the number, we need to move right because we have to find last occurrence
            return findLastOccurrence(numArray, numToFind, mid + 1, end);
        } else {
            return findLastOccurrence(numArray, numToFind, start, mid - 1);
        }
    }

}
