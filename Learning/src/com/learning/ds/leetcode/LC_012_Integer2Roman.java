package com.learning.ds.leetcode;

public class LC_012_Integer2Roman {
    static String[] roman = {"I", "IV", "V", "IX","X", "L", "XC", "C", "D", "CM", "M"};
    static int[] values = {1, 4, 5, 9, 10, 50, 90, 100, 500, 900, 1000};

    public static void main(String[] args) {
        int num = 3994;// MMMCMXCIV
        String romanString = getRoman(num);
        System.out.println(romanString);
    }

    private static String getRoman(int num) {
        String retString = "";
        for(int i = values.length - 1; i >= 0; i--) {
            if(num / values[i] > 0) {
                int number = num / values[i];
                for(int j = 0; j < number; j++) {
                    retString = retString + roman[i];
                }
                num = num % values[i];
            }
        }

        return retString;
    }

}
