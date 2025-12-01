package com.learning.ds.binarysearch.verma;

public class P20_SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] numArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        findNum(numArray, 2, 0, numArray.length * numArray[0].length - 1);
    }

    public static void findNum(int[][] numArray, int numToFind, int start, int end) {
        if(start > end)
            return;

        int mid = start + (end - start) / 2;
        int midRow = mid / numArray[0].length; // Divide by num of columns in a row to get mid row.
        int midCol = mid % numArray[0].length; // The remainder is the col we are interested in.

        if(numArray[midRow][midCol] == numToFind) {
            System.out.println("Row: "+midRow+", Col: "+midCol);
            return;
        }

        if(numArray[midRow][midCol] > numToFind) {
            findNum(numArray, numToFind, start, mid - 1);
        } else {
            findNum(numArray, numToFind, mid + 1, end);
        }
    }
}
