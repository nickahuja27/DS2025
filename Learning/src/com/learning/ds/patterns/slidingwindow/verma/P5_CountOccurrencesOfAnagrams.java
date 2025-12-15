package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P5_CountOccurrencesOfAnagrams {
    public static void main(String[] args) {
//        String text = "forxxxorfxdofr";
//        String pattern = "for";
        String text = "aabaabaa";
        String pattern = "aaba";

        countAnagrams(text, pattern);
    }

    private static void countAnagrams(String text, String pattern) {
        int start = 0;
        int end = 0;
        int anagramCounter = 0;
        int counter = pattern.length();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(Character c : pattern.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        counter = charCountMap.keySet().size();

        while (end < text.length()) {
            if(charCountMap.get(text.charAt(end)) != null) {
                charCountMap.put(text.charAt(end), charCountMap.get(text.charAt(end)) - 1);
                if(charCountMap.get(text.charAt(end)) == 0)
                    counter--;
            }
            if(end - start + 1 < pattern.length())
                end++;
            else {
                if(counter == 0) {
                    anagramCounter++;
                }

                //This check is to determine only chars in pattern are considered.
                if(charCountMap.get(text.charAt(start)) != null) {
                    if (charCountMap.get(text.charAt(start)) == 0)
                        counter++;
                    charCountMap.put(text.charAt(start), charCountMap.get(text.charAt(start)) + 1);
                }
                start++;
                end++;
            }
        }
        System.out.println("Total number of Anagrams: " + anagramCounter);
    }
}
