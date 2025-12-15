package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;
import java.util.Map;

public class P10_VariableSize_LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String inStr = "geeksforgeeks";
        findLongestSubString(inStr);
    }

    private static void findLongestSubString(String inStr) {
        int start = 0;
        int end = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        char[] inChars = inStr.toCharArray();

        while (end < inChars.length) {
            charCountMap.put(inChars[end], charCountMap.getOrDefault(inChars[end], 0) + 1);
            if(charCountMap.size() < (end - start + 1)) {
                while (charCountMap.size() < (end - start + 1)) {
                    charCountMap.put(inChars[start],
                            charCountMap.get(inChars[start]) - 1);
                    if(charCountMap.get(inChars[start]) == 0)
                        charCountMap.remove(inChars[start]);
                    start++;
                }
            }
            if(charCountMap.size() == (end - start + 1)) {
                maxLength = Math.max(maxLength, (end - start) + 1);
            }
            end++;
        }
        System.out.println("Max length is: " + maxLength);
    }
}
