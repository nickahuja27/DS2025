package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LC_049_GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, ArrayList<String>> groupsMap = new HashMap<>();
        findGroups(strs, groupsMap);
        System.out.println(groupsMap.values());
    }

    private static void findGroups(String[] strs, HashMap<String, ArrayList<String>> groupsMap) {
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(groupsMap.get(sortedStr) == null) {
                groupsMap.put(sortedStr, new ArrayList());
            }
            ArrayList<String> groupsList = groupsMap.get(sortedStr);
            groupsList.add(str);
        }
    }
}
