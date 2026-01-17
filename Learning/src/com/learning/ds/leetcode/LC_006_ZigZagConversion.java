package com.learning.ds.leetcode;

import java.util.ArrayList;

public class LC_006_ZigZagConversion {
    public static void main(String[] args) {
        String inString = "PAYPALISHIRING";
        int rows = 3;
        print(inString, rows);
    }

    private static void print(String inString, int rows) {
        ArrayList<Character> rowList[] = new ArrayList[rows];
        for(int i = 0; i < rows; i++) {
            rowList[i] = new ArrayList<>();
        }

        int index = 0;
        boolean downFlag = true;
        for(int i = 0; i < inString.length(); i++) {
            rowList[index].add(inString.charAt(i));
            if(index == rows - 1) {
                downFlag = !downFlag;
            }
            if(downFlag)
                index++;
            else
                index--;

            if(index == 0) {
                downFlag = !downFlag;
            }
        }

        for(int i = 0; i < rows; i++) {
            System.out.println(rowList[i]);
        }
    }
}
