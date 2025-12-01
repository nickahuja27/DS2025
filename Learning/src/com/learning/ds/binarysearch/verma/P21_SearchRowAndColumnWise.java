package com.learning.ds.binarysearch.verma;

public class P21_SearchRowAndColumnWise {
    public static void main(String[] args) {
        int[][] numArray = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        findNum(numArray, 33, 0, numArray[0].length - 1);
    }

    public static void findNum(int[][] inArray, int numToFind, int row, int col) {
        while (row < inArray.length && col >= 0) {
            if(inArray[row][col] == numToFind) {
                System.out.println("Row: "+row+", Col: "+col);
                break;
            } else if (numToFind < inArray[row][col]) {
                col--;
            } else {
                row++;
            }
        }
    }
}
