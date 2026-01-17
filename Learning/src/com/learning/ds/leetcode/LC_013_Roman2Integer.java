package com.learning.ds.leetcode;

import java.util.HashMap;

public class LC_013_Roman2Integer {
    static char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    static int[] values = {1, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) {
        String romanNum = "MMMCMXCIV"; // 3994
        int num = getNum(romanNum);
        System.out.println(num);
    }

    private static int getNum(String romanNum) {
        HashMap<Character, Integer> romanToValueMap = new HashMap<>();
        for(int i = 0; i < values.length; i++) {
            romanToValueMap.put(roman[i], values[i]);
        }

        int num = 0;
        for(int i = 0; i < romanNum.length(); i++) {
            char romanChar = romanNum.charAt(i);
            int currValue = romanToValueMap.get(romanChar);
            System.out.println(i);
            if(i < romanNum.length()) {
                int nextValue = romanToValueMap.get(romanNum.charAt(i + 1));
                if(nextValue > currValue) {
                    currValue = nextValue - currValue;
                    i++;
                }
            }
            num = num + currValue;
        }
        return num;
    }
}
