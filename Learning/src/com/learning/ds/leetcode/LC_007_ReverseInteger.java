package com.learning.ds.leetcode;

public class LC_007_ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        int reverseInt = reverse(num);
        System.out.println(reverseInt);
    }

    private static int reverse(int num) {
        int reverseInt = 0;
        while (num > 0) {
            reverseInt = reverseInt * 10 + num % 10;
            num = num / 10;
        }

        return reverseInt;
    }
}
