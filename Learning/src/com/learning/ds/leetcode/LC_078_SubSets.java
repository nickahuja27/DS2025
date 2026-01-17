package com.learning.ds.leetcode;

import java.util.ArrayList;

public class LC_078_SubSets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        findSubsets(nums, 0, new ArrayList<Integer>());
    }

    private static void findSubsets(int[] nums, int index, ArrayList<Integer> list) {
        System.out.println(list);

        if(list.size() == nums.length)
            return;

        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            findSubsets(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
