package com.learning.ds.recursion.verma;

public class P1_FindAllSubSetsofAGivenString {
    public static void main(String[] args) {
        findSubsets("abc", 0, "");
    }

    private static void findSubsets(String inString, int index, String subsetSoFar) {
        if(index == inString.length()) {
            System.out.println(":" + subsetSoFar);
            return;
        }

        findSubsets(inString, index + 1, subsetSoFar + inString.charAt(index));
        findSubsets(inString, index + 1, subsetSoFar);
    }
}
