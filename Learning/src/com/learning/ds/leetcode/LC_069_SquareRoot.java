package com.learning.ds.leetcode;

public class LC_069_SquareRoot {
    public static void main(String[] args) {
        int ans = binarySearch(17, 0, 17);
        System.out.println(ans);
    }

    private static int binarySearch(int givenNum, int low, int high) {
        if(low > high)
            return 0;

        int mid = (low + high) / 2;

        if(mid * mid == givenNum)
            return mid;

        if(mid * mid < givenNum && ((mid + 1) * (mid + 1) > givenNum)) {
            return mid;
        }

        if(mid*mid < givenNum) {
            return binarySearch(givenNum, mid + 1, high);
        } else {
            return binarySearch(givenNum, low, mid - 1);
        }
    }
}
