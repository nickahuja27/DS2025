package com.learning.ds.leetcode;

public class LC_091_DecodeWays {
    public static void main(String[] args) {
        String inString = "226";
        StringBuilder stringBuilder = new StringBuilder();
        decodeWays(inString, 0, stringBuilder);
        System.out.println(stringBuilder);
    }

    private static void decodeWays(String inString, int index, StringBuilder stringSoFar) {
        if(index >= inString.length()){
            System.out.println(stringSoFar);
            return;
        }

        for(int i = index; i < inString.length(); i++) {
            addChar(inString.substring(index, i + 1), stringSoFar);
            decodeWays(inString, i + 1, stringSoFar);
            if(stringSoFar.length() > 0) {
                stringSoFar.deleteCharAt(stringSoFar.length() - 1);
            }
        }
    }

    private static void addChar(String workingString, StringBuilder stringSoFar) {
        if(workingString.length() > 0) {
            int tempInt = Integer.parseInt(workingString);
            if(tempInt <= 26) {
                char tempChar = (char)(65 + tempInt - 1);
                stringSoFar.append(tempChar);
            }
        }
    }
}
