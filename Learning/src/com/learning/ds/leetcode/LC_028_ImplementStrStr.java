package com.learning.ds.leetcode;

public class LC_028_ImplementStrStr {
    public static void main(String[] args) {
        int index = findIndexNew("HellHelloWorld", "Hello");
        System.out.println(index);
    }

    private static int findIndexNew(String hayStack, String needle) {
        for(int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(0)) {
                boolean match = true;
                for(int j = 0; j < needle.length(); j++) {
                    if(hayStack.charAt(i+j) != needle.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if(match)
                    return i;
            }
        }
        return 0;
    }

    private static int findIndex(String hayStack, String needle) {
        int index = -1;
        int counter = 0;

        boolean found = false;
        for(int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(counter)) {
                counter++;
                found = true;
            } else {
                counter = 0;
                if(found) {
                    i--;
                    found = false;
                }
            }

            if(counter == needle.length()) {
                index = i - needle.length() + 1;
                break;
            }
        }
        return index;
    }
}
