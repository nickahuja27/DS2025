package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_018_4Sum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        find4Sum(nums);
    }

    private static void find4Sum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 3; i++) {
            for(int j = i + 1; j < nums.length - 2; j++) {
                int low = j + 1;
                int high = nums.length -1;
                while (low < high) {
                    int tempSum = nums[i] + nums[j] + nums[low] + nums[high];
                    if(tempSum < 0)
                        low++;
                    else if(tempSum > 0)
                        high--;
                    else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        result.add(list);
                        low++;
                        high--;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
