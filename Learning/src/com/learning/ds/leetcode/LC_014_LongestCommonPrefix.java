package com.learning.ds.leetcode;

public class LC_014_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = findPrefix(strs);
        System.out.println(prefix);
    }

    private static String findPrefix(String[] strs) {
        String str = strs[0];

        String prefix = "";
        for(int i = 0; i < str.length(); i++) {
            boolean matchFound = true;
            for (int j = 0; j < strs.length; j++) {
                if(i >= strs[j].length() || str.charAt(i) != strs[j].charAt(i)) {
                    matchFound = false;
                    break;
                }
            }
            if(matchFound) {
                prefix += str.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}
