package com.learning.ds.leetcode;

// MAKE SURE YOU READ THIS ARTICLE...
// https://www.programcreek.com/2012/12/leetcode-powx-n/
public class LC_050_Power {
    private static double pow(int number, int power) {
        if(power == 0)
            return 1;

        if(power < 0) {
            return 1 / pow(number, -power);
        } else {
            return number * pow(number, power - 1);
        }
    }
}
