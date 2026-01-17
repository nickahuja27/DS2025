package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        int length = characterReplacement("AAABABBBBB", 1);
        System.out.println("Length is: " + length);
    }


    private static int characterReplacement(String inString, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int result = 0;

        int left = 0, maxFreq = 0;
        for (int right = 0; right < inString.length(); right++) {
            count.put(inString.charAt(right), count.getOrDefault(inString.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, count.get(inString.charAt(right)));

            while ((right - left + 1) - maxFreq > k) {
                count.put(inString.charAt(left), count.get(inString.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
