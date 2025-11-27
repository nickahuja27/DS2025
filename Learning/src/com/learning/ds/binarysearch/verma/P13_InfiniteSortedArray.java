package com.learning.ds.binarysearch.verma;

public class P13_InfiniteSortedArray {
    public static void main(String[] args) {
        int[] numArray = {1,3,6,7,8,9,10,12,13,15,16,17,18,19,20,21,22,23};
        int index = findNum(numArray, 21, 0, 1);
        System.out.println("Index : " + index);
    }

    public static int findNum(int[] numArray, int numToFind, int start, int end) {
        int startIndex = 0;
        int endIndex = 1;

        while (endIndex < numArray.length) {
            if(numArray[endIndex] > numToFind) {
                endIndex = endIndex > numArray.length ? numArray.length - 1 : endIndex;
                break;
            } else {
                startIndex = endIndex + 1;
                endIndex = 2 * endIndex;
            }
        }

        return findIndex(numArray, numToFind, startIndex, endIndex);
    }

    public static int findIndex(int[] numArray, int numToFind, int start, int end) {
        if(end < start)
            return -1;

        int mid = (start + end) / 2;
        if(numArray[mid] == numToFind) {
            return mid;
        }

        if(numArray[mid] > numToFind)
            return findIndex(numArray, numToFind, start, mid - 1);

        else
            return findIndex(numArray, numToFind, mid + 1, end);
    }
}
