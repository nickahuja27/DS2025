package com.learning.ds.leetcode;

public class LC_067_AddBinary {
    public static void main(String[] args) {
        String addedStr = addBinary("111", "11");
        System.out.println(addedStr);
        Float.parseFloat("1.22");
    }

    private static String addBinary(String x, String y) {
        int carryOver = 0;
        StringBuilder retBuffer = new StringBuilder();
        StringBuilder xBuilder = new StringBuilder(x);
        StringBuilder yBuilder = new StringBuilder(y);
        xBuilder.reverse();
        yBuilder.reverse();

        for(int i = 0; i < xBuilder.length(); i++) {
            int xInt = xBuilder.charAt(i) - '0';
            int yInt = i < yBuilder.length() ? yBuilder.charAt(i) - '0' : 0;
            int sum = (xInt + yInt + carryOver) % 2;
            carryOver = (xInt + yInt + carryOver) / 2;
            retBuffer.append(sum);
        }

        if(carryOver > 0)
            retBuffer.append(carryOver);


        return retBuffer.reverse().toString();
    }
}
