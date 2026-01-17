package com.learning.ds.leetcode;

public class LC_043_MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";
        int value = multiply(num1, num2);
        System.out.println(value);
    }

    private static int multiply(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();
        int[] summedNums = new int[num2.length()];

        for(int i = 0; i < num2Chars.length; i++) {
            int secNum = Character.getNumericValue(num2Chars[i]);
            int carryOver = 0;
            int multipliedNum = 0;
            for(int j = 0; j < num1Chars.length; j++) {
                int tempNum = secNum * Character.getNumericValue(num1Chars[j]);
                multipliedNum = multipliedNum * 10 + tempNum % 10 + carryOver;
                carryOver = tempNum / 10;
            }
            if(carryOver > 0) {
                multipliedNum = multipliedNum * 10 + carryOver;
            }

            summedNums[i] = Integer.parseInt(new StringBuilder(""+multipliedNum).reverse().toString());
        }

        int finalNum = 0;

        for(int i = 0; i < summedNums.length; i++) {
            finalNum = finalNum  + summedNums[i] * (int)Math.pow(10 , i);
        }

        return finalNum;
    }
}
