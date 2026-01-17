package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_017_LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        char[] inNumber = "23".toCharArray();
        char[] tempArray = new char[inNumber.length];
        findCombinations(inNumber, 0, tempArray, results);
        System.out.println(results);
    }

    private static void findCombinations(char inNumber[], int index, char[] tempArray, List<String> results) {
        if(index == tempArray.length) {
            results.add(new String(tempArray));
            return;
        }

        int indexNum = Integer.parseInt("" + inNumber[index]);
        char[] charsForNumber = getCharacters(indexNum).toCharArray();
        for(int i = 0; i < charsForNumber.length; i++) {
            tempArray[index] = charsForNumber[i];
            findCombinations(inNumber, index + 1, tempArray, results);
        }
    }

    private static String getCharacters(int number) {
        switch (number) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }

}
