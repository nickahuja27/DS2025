package com.learning.ds.leetcode;

public class LC_038_CountAndSay {
    public static void main(String[] args) {
        String results = countAndSay(4);
        System.out.println(results);
    }

    private static String countAndSay(int number) {
        String result = "1";
        for(int i = 0; i < number; i++) {
            result = justSay(result);
        }
        return result;
    }

    private static String justSay(String number) {
        int frequency = 1;
        String result = "";
        char prevChar = number.charAt(0);

        for(int i = 1; i < number.length(); i++) {
            if(number.charAt(i) != prevChar) {
                result = result + frequency + prevChar;
                frequency = 1;
                prevChar = number.charAt(i);
            } else {
                frequency++;
            }
        }
        result = result + frequency + prevChar;

        return result;
    }
}
