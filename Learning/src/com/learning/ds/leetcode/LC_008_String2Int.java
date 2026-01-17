package com.learning.ds.leetcode;

public class LC_008_String2Int {
    public static void main(String[] args) {
        String stringNum = "42";
        int num = convert(stringNum);
        System.out.println(num);
    }

    private static int convert(String stringNum) {
        int num = 0;
        for(int i = 0; i < stringNum.length(); i++) {
            int singleDigit = stringNum.charAt(i) - '0';
            num = num * 10 + singleDigit;
        }
        return num;
    }
}
